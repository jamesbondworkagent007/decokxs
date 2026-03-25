package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationEntryPointEnum;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.UnViewedNotificationResp;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.ViewAllNotificationResp;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.module.service.SystemPushServiceImpl$getNotificationSwitchesStatus$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.module.service.SystemPushServiceImpl$markNotificationConversationViewed$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.module.service.SystemPushServiceImpl$startCategoryPushAdvanceSettingsPageForResult$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.module.service.SystemPushServiceImpl$updateNotificationSwitchStatus$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.ChannelStatus;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingsChannelReq;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SwitchNotificationSettingsChannelReq;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.model.NotificationViewAllRequest;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.MessageSettingModeInfo;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.SwitchItemInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class rZA extends AbstractC43215rlA implements rXQ {
    public final rYV AEQbTJ;
    public final C44626saV AYXKKw;
    public final rYY AhwBna;
    public final InterfaceC44628saX DbNXlk;
    public final rYZ EZpvd;
    public final rYN KWHzl;
    public final rYU OLrzqt;
    public final rYS copydefault;
    public final C42601rYx djBIcL;
    public final rYO fetchVPNInfo;
    public final rZE gEmmrt;
    public final rYM isConnected;
    public final C42608rZd valueOf;
    public final rYT values;

    @yCM
    public rZA(@NotNull rYZ ryz, @NotNull rYY ryy, @NotNull C44626saV c44626saV, @NotNull rZE rze, @NotNull InterfaceC44628saX interfaceC44628saX, @NotNull rYN ryn, @NotNull rYM rym, @NotNull rYV ryv, @NotNull C42608rZd c42608rZd, @NotNull rYU ryu, @NotNull C42601rYx c42601rYx, @NotNull rYT ryt, @NotNull rYO ryo, @NotNull rYS rys) {
        Intrinsics.checkNotNullParameter(ryz, "");
        Intrinsics.checkNotNullParameter(ryy, "");
        Intrinsics.checkNotNullParameter(c44626saV, "");
        Intrinsics.checkNotNullParameter(rze, "");
        Intrinsics.checkNotNullParameter(interfaceC44628saX, "");
        Intrinsics.checkNotNullParameter(ryn, "");
        Intrinsics.checkNotNullParameter(rym, "");
        Intrinsics.checkNotNullParameter(ryv, "");
        Intrinsics.checkNotNullParameter(c42608rZd, "");
        Intrinsics.checkNotNullParameter(ryu, "");
        Intrinsics.checkNotNullParameter(c42601rYx, "");
        Intrinsics.checkNotNullParameter(ryt, "");
        Intrinsics.checkNotNullParameter(ryo, "");
        Intrinsics.checkNotNullParameter(rys, "");
        this.EZpvd = ryz;
        this.AhwBna = ryy;
        this.AYXKKw = c44626saV;
        this.gEmmrt = rze;
        this.DbNXlk = interfaceC44628saX;
        this.KWHzl = ryn;
        this.isConnected = rym;
        this.AEQbTJ = ryv;
        this.valueOf = c42608rZd;
        this.OLrzqt = ryu;
        this.djBIcL = c42601rYx;
        this.values = ryt;
        this.fetchVPNInfo = ryo;
        this.copydefault = rys;
    }

    @Override // o.rXQ
    public void copydefault(@NotNull android.content.Context context, @NotNull AppNotificationBizType appNotificationBizType, int i, @NotNull Function1<? super java.lang.Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appNotificationBizType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt.EZpvd(context, appNotificationBizType);
    }

    @Override // o.rXQ
    public void copydefault(@NotNull android.content.Context context, int i, @NotNull AppNotificationBizType appNotificationBizType, int i2, @NotNull Function1<? super java.lang.Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appNotificationBizType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SystemPushServiceImpl$startCategoryPushAdvanceSettingsPageForResult$1(this, appNotificationBizType, function1, i, context, null), 3, null);
    }

    @Override // o.rXQ
    public Flow<rXZ> EZpvd() {
        return this.DbNXlk.copydefault();
    }

    @Override // o.rXQ
    public Flow<java.lang.Integer> AEQbTJ() {
        return this.DbNXlk.AEQbTJ();
    }

    @Override // o.rXQ
    public void KWHzl() {
        this.DbNXlk.KWHzl();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.saV.getAllSettingItemInfoList$default(o.saV, com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.MessageSettingModeInfo, boolean, int, java.lang.Object):java.util.List */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.rXQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull AppNotificationBizType appNotificationBizType, @NotNull java.util.List<? extends NotificationType> list, @NotNull Continuation<? super java.util.List<rXN>> continuation) throws java.lang.Throwable {
        SystemPushServiceImpl$getNotificationSwitchesStatus$1 systemPushServiceImpl$getNotificationSwitchesStatus$1;
        rZA rza;
        java.util.List list2;
        java.lang.Object next;
        if (continuation instanceof SystemPushServiceImpl$getNotificationSwitchesStatus$1) {
            systemPushServiceImpl$getNotificationSwitchesStatus$1 = (SystemPushServiceImpl$getNotificationSwitchesStatus$1) continuation;
            int i = systemPushServiceImpl$getNotificationSwitchesStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                systemPushServiceImpl$getNotificationSwitchesStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                systemPushServiceImpl$getNotificationSwitchesStatus$1 = new SystemPushServiceImpl$getNotificationSwitchesStatus$1(this, continuation);
            }
        }
        java.lang.Object obj = systemPushServiceImpl$getNotificationSwitchesStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = systemPushServiceImpl$getNotificationSwitchesStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            rYY ryy = this.AhwBna;
            systemPushServiceImpl$getNotificationSwitchesStatus$1.L$0 = this;
            systemPushServiceImpl$getNotificationSwitchesStatus$1.L$1 = list;
            systemPushServiceImpl$getNotificationSwitchesStatus$1.L$2 = arrayList;
            systemPushServiceImpl$getNotificationSwitchesStatus$1.label = 1;
            java.lang.Object objAEQbTJ = ryy.AEQbTJ(appNotificationBizType, systemPushServiceImpl$getNotificationSwitchesStatus$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            rza = this;
            obj = objAEQbTJ;
            list2 = arrayList;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (java.util.List) systemPushServiceImpl$getNotificationSwitchesStatus$1.L$2;
            list = (java.util.List) systemPushServiceImpl$getNotificationSwitchesStatus$1.L$1;
            rza = (rZA) systemPushServiceImpl$getNotificationSwitchesStatus$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((MessageSettingModeInfo) next).isSelected()) {
                break;
            }
        }
        MessageSettingModeInfo messageSettingModeInfo = (MessageSettingModeInfo) next;
        if (messageSettingModeInfo != null) {
            java.util.List allSettingItemInfoList$default = C44626saV.getAllSettingItemInfoList$default(rza.AYXKKw, messageSettingModeInfo, false, 2, null);
            java.util.ArrayList<SwitchItemInfo> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : allSettingItemInfoList$default) {
                SwitchItemInfo switchItemInfo = (SwitchItemInfo) obj2;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(C56443yFo.AEQbTJ(((NotificationType) it2.next()).getType()));
                }
                if (arrayList3.contains(C56443yFo.AEQbTJ(switchItemInfo.getSwitchType()))) {
                    arrayList2.add(obj2);
                }
            }
            for (SwitchItemInfo switchItemInfo2 : arrayList2) {
                int switchType = switchItemInfo2.getSwitchType();
                NotificationType notificationType = NotificationType.PRICE_ALERT;
                if (switchType == notificationType.getType()) {
                    list2.add(new rXN(notificationType, switchItemInfo2.isOpen() ? 1 : 0));
                } else {
                    NotificationType notificationType2 = NotificationType.TRADE;
                    if (switchType == notificationType2.getType()) {
                        list2.add(new rXN(notificationType2, switchItemInfo2.isOpen() ? 1 : 0));
                    } else {
                        NotificationType notificationType3 = NotificationType.CUSTOM_PRICE_PRICE;
                        if (switchType == notificationType3.getType()) {
                            list2.add(new rXN(notificationType3, switchItemInfo2.isOpen() ? 1 : 0));
                        }
                    }
                }
            }
        }
        return list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull AppNotificationBizType appNotificationBizType, @NotNull java.util.List<rXN> list, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        SystemPushServiceImpl$updateNotificationSwitchStatus$1 systemPushServiceImpl$updateNotificationSwitchStatus$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof SystemPushServiceImpl$updateNotificationSwitchStatus$1) {
            systemPushServiceImpl$updateNotificationSwitchStatus$1 = (SystemPushServiceImpl$updateNotificationSwitchStatus$1) continuation;
            int i = systemPushServiceImpl$updateNotificationSwitchStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                systemPushServiceImpl$updateNotificationSwitchStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                systemPushServiceImpl$updateNotificationSwitchStatus$1 = new SystemPushServiceImpl$updateNotificationSwitchStatus$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = systemPushServiceImpl$updateNotificationSwitchStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = systemPushServiceImpl$updateNotificationSwitchStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                int type = appNotificationBizType.getType();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (rXN rxn : list) {
                    arrayList.add(new NotificationSettingsChannelReq(rxn.copydefault().getType(), C56402yEa.EZpvd(new ChannelStatus(1, rxn.OLrzqt()))));
                }
                SwitchNotificationSettingsChannelReq switchNotificationSettingsChannelReq = new SwitchNotificationSettingsChannelReq(type, arrayList);
                rYM rym = this.isConnected;
                systemPushServiceImpl$updateNotificationSwitchStatus$1.label = 1;
                objAEQbTJ = rym.AEQbTJ(switchNotificationSettingsChannelReq, systemPushServiceImpl$updateNotificationSwitchStatus$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return C56443yFo.KWHzl(stateListAnimator.EZpvd());
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return C56443yFo.KWHzl(stateListAnimator.EZpvd());
    }

    @Override // o.rXQ
    public java.lang.Object EZpvd(@NotNull NotificationEntryPointEnum notificationEntryPointEnum, @NotNull Continuation<? super java.util.List<NotificationCategoryBean>> continuation) {
        return this.AEQbTJ.OLrzqt(notificationEntryPointEnum, continuation);
    }

    @Override // o.rXQ
    public java.lang.Object OLrzqt(@NotNull java.util.List<rXL> list, @NotNull Continuation<? super UnViewedNotificationResp> continuation) {
        return C42608rZd.invoke$default(this.valueOf, list, null, continuation, 2, null);
    }

    @Override // o.rXQ
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.Long l, int i, @NotNull Continuation<? super java.util.List<SystemNotification>> continuation) {
        return this.OLrzqt.AEQbTJ(str, l, C56443yFo.AEQbTJ(i), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.rXQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super ViewAllNotificationResp> continuation) throws java.lang.Throwable {
        SystemPushServiceImpl$markNotificationConversationViewed$1 systemPushServiceImpl$markNotificationConversationViewed$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof SystemPushServiceImpl$markNotificationConversationViewed$1) {
            systemPushServiceImpl$markNotificationConversationViewed$1 = (SystemPushServiceImpl$markNotificationConversationViewed$1) continuation;
            int i = systemPushServiceImpl$markNotificationConversationViewed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                systemPushServiceImpl$markNotificationConversationViewed$1.label = i - Integer.MIN_VALUE;
            } else {
                systemPushServiceImpl$markNotificationConversationViewed$1 = new SystemPushServiceImpl$markNotificationConversationViewed$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = systemPushServiceImpl$markNotificationConversationViewed$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = systemPushServiceImpl$markNotificationConversationViewed$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                NotificationViewAllRequest notificationViewAllRequest = new NotificationViewAllRequest(str);
                C42601rYx c42601rYx = this.djBIcL;
                systemPushServiceImpl$markNotificationConversationViewed$1.label = 1;
                objOLrzqt = c42601rYx.OLrzqt(notificationViewAllRequest, systemPushServiceImpl$markNotificationConversationViewed$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            responseData = (ResponseData) objOLrzqt;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return stateListAnimator.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return stateListAnimator.AEQbTJ();
    }

    @Override // o.rXQ
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, android.net.Uri uri, @NotNull java.lang.String str6, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.values.copydefault(str, str2, i, str3, str4, str5, z, uri, str6, z2, z3);
    }

    @Override // o.rXQ
    public void KWHzl(int i) {
        this.copydefault.AEQbTJ(i);
    }

    @Override // o.rXQ
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.fetchVPNInfo.OLrzqt(str, str2, str3);
    }
}
