package com.luckwine.oss.module.synthesize.remote.ad;

import com.alibaba.dubbo.config.annotation.Reference;
import com.luckwine.parent.entitybase.request.CommonRequest;
import com.luckwine.parent.entitybase.response.CommonResponse;
import com.luckwine.parent.template.SingleRemoteTemplate;
import com.luckwine.synthesize.model.base.AdContent;
import com.luckwine.synthesize.service.AdContentService;
import org.apache.dubbo.config.annotation.DubboReference;


public class AdContentDetailRemoteService extends SingleRemoteTemplate<AdContent, AdContent> {

    @DubboReference(validation = "true")
    private AdContentService adContentService;

    @Override
    protected CommonResponse<AdContent> callRemote(CommonRequest<AdContent> request) {
        return adContentService.queryAdContentById(request);
    }
}
