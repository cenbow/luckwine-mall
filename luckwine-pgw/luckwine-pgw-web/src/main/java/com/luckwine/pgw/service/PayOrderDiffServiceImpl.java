package com.luckwine.pgw.service;

import com.luckwine.parent.entitybase.request.CommonQueryPageRequest;
import com.luckwine.parent.entitybase.response.CommonQueryPageResponse;
import com.luckwine.pgw.model.base.PayOrderDiff;
import com.luckwine.pgw.model.base.PayOrderDiffBatch;
import com.luckwine.pgw.model.request.PayOrderDiffBatchPageRequest;
import com.luckwine.pgw.model.request.PayOrderDiffPageRequest;
import com.luckwine.pgw.model.service.PayOrderDiffService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

@DubboService
public class PayOrderDiffServiceImpl implements PayOrderDiffService {
    @Override
    public CommonQueryPageResponse<List<PayOrderDiff>> page(CommonQueryPageRequest<PayOrderDiffPageRequest> request) {
        return null;
    }

    @Override
    public CommonQueryPageResponse<List<PayOrderDiffBatch>> pageBatch(CommonQueryPageRequest<PayOrderDiffBatchPageRequest> request) {
        return null;
    }
}
