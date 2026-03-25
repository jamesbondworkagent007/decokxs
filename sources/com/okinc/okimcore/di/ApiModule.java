package com.okinc.okimcore.di;

import com.okinc.okimcore.feature.agentbot.remote.AgentBotApiService;
import com.okinc.okimcore.feature.contact.repository.remote.inhouseim.InHouseIMRelationService;
import com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.feature.message.contractaddress.repository.remote.InHouseIMContractAddressService;
import com.okinc.okimcore.feature.message.repository.remote.IMMessageService;
import com.okinc.okimcore.feature.share.repository.remote.IMShareService;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMCallServiceApi;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;
import com.okinc.okimcore.feature.user.repository.remote.inhouseim.InHouseIMAuthService;
import com.okinc.okimcore.feature.user.repository.remote.inhouseim.InHouseIMUserService;
import o.C43393roT;
import o.C44233sIf;
import o.C44234sIg;
import o.C56524yIo;
import o.InterfaceC44123sEd;
import o.sHS;
import o.sRM;

/* JADX INFO: loaded from: classes10.dex */
public final class ApiModule {
    public final InHouseIMConversationService valueOf() {
        return (InHouseIMConversationService) C43393roT.EZpvd(C56524yIo.AEQbTJ(InHouseIMConversationService.class), new C44234sIg());
    }

    public final InHouseIMUploadMediaService isConnected() {
        return (InHouseIMUploadMediaService) C43393roT.EZpvd(C56524yIo.AEQbTJ(InHouseIMUploadMediaService.class), new C44233sIf());
    }

    public final InHouseIMGroupService djBIcL() {
        return (InHouseIMGroupService) C43393roT.EZpvd(C56524yIo.AEQbTJ(InHouseIMGroupService.class), new C44234sIg());
    }

    public final InHouseIMRelationService gEmmrt() {
        return (InHouseIMRelationService) C43393roT.EZpvd(C56524yIo.AEQbTJ(InHouseIMRelationService.class), new C44234sIg());
    }

    public final InHouseIMUserService AkhnZx() {
        return (InHouseIMUserService) C43393roT.EZpvd(C56524yIo.AEQbTJ(InHouseIMUserService.class), new C44234sIg());
    }

    public final InHouseIMAuthService EZpvd() {
        return (InHouseIMAuthService) C43393roT.httpService$default(C56524yIo.AEQbTJ(InHouseIMAuthService.class), null, 1, null);
    }

    public final sHS copydefault() {
        return (sHS) C43393roT.httpService$default(C56524yIo.AEQbTJ(sHS.class), null, 1, null);
    }

    public final InHouseIMCallServiceApi OLrzqt() {
        return (InHouseIMCallServiceApi) C43393roT.EZpvd(C56524yIo.AEQbTJ(InHouseIMCallServiceApi.class), new C44234sIg());
    }

    public final InterfaceC44123sEd KWHzl() {
        return (InterfaceC44123sEd) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC44123sEd.class), new C44234sIg());
    }

    public final IMShareService fetchVPNInfo() {
        return (IMShareService) C43393roT.EZpvd(C56524yIo.AEQbTJ(IMShareService.class), new C44234sIg());
    }

    public final IMMessageService AhwBna() {
        return (IMMessageService) C43393roT.EZpvd(C56524yIo.AEQbTJ(IMMessageService.class), new C44234sIg());
    }

    public final sRM values() {
        return (sRM) C43393roT.EZpvd(C56524yIo.AEQbTJ(sRM.class), new C44234sIg());
    }

    public final InHouseIMContractAddressService AYXKKw() {
        return (InHouseIMContractAddressService) C43393roT.EZpvd(C56524yIo.AEQbTJ(InHouseIMContractAddressService.class), new C44234sIg());
    }

    public final AgentBotApiService AEQbTJ() {
        return (AgentBotApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(AgentBotApiService.class), new C44234sIg());
    }
}
