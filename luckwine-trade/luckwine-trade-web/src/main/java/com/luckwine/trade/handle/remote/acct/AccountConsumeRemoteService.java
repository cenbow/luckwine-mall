package com.luckwine.trade.handle.remote.acct;


import com.luckwine.acct.model.request.AcctDeductingRequest;
import com.luckwine.acct.model.response.TransRes;
import com.luckwine.acct.service.trans.AccountDeductingService;
import com.luckwine.parent.entitybase.request.CommonRequest;
import com.luckwine.parent.entitybase.response.CommonResponse;
import com.luckwine.parent.template.SingleRemoteTemplate;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * 余额消费
 */
@Service
public class AccountConsumeRemoteService extends SingleRemoteTemplate<AcctDeductingRequest, TransRes> {

    @DubboReference(version = "1.0.0", timeout = 25000)
    private AccountDeductingService accountDeductingService;

    @Override
    protected CommonResponse<TransRes> callRemote(CommonRequest<AcctDeductingRequest> remoteRequest) {
        //远程请求
        CommonResponse<TransRes> remoteRes = accountDeductingService.consume(remoteRequest);
        return remoteRes;
    }
}
