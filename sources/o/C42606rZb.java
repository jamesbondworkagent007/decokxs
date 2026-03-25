package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.MsgSwitch;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.domain.systemmessage.MsgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.domain.systemmessage.MsgSwitchUseCaseImpl$getMessageSwitchList$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationAdvancedSettings;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SettingsChannel;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.MessageSettingModeInfo;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.ModeSwitchGroupInfo;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.SwitchItemInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rZb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C42606rZb implements rYY {
    public final CoroutineDispatcher EZpvd;
    public final C42600rYw KWHzl;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C42606rZb(@NotNull C42600rYw c42600rYw, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c42600rYw, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c42600rYw;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.rYY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull AppNotificationBizType appNotificationBizType, @NotNull Continuation<? super java.util.List<MessageSettingModeInfo>> continuation) throws java.lang.Throwable {
        MsgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1 msgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List listAhwBna;
        if (continuation instanceof MsgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1) {
            msgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1 = (MsgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1) continuation;
            int i = msgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                msgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                msgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1 = new MsgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = msgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = msgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                C42600rYw c42600rYw = this.KWHzl;
                int type = appNotificationBizType.getType();
                msgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1.label = 1;
                objCopydefault = c42600rYw.copydefault(type, msgSwitchUseCaseImpl$getMessageSettingModeListSuspend$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            ResponseData responseData = (ResponseData) objCopydefault;
            if (responseData.getCode() == 0 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                java.util.List<NotificationAdvancedSettings> list = (java.util.List) responseData.getData();
                if (list != null) {
                    int i3 = 10;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (NotificationAdvancedSettings notificationAdvancedSettings : list) {
                        java.lang.String categoryName = notificationAdvancedSettings.getCategoryName();
                        java.lang.String str = categoryName == null ? "" : categoryName;
                        java.lang.String categoryDetail = notificationAdvancedSettings.getCategoryDetail();
                        java.lang.String str2 = categoryDetail == null ? "" : categoryDetail;
                        java.lang.String darkIconLink = notificationAdvancedSettings.getDarkIconLink();
                        java.lang.String str3 = darkIconLink == null ? "" : darkIconLink;
                        java.lang.String lightIconLink = notificationAdvancedSettings.getLightIconLink();
                        java.lang.String str4 = lightIconLink == null ? "" : lightIconLink;
                        java.lang.Boolean showItemsUnderCategory = notificationAdvancedSettings.getShowItemsUnderCategory();
                        boolean zBooleanValue = showItemsUnderCategory != null ? showItemsUnderCategory.booleanValue() : false;
                        java.util.List<NotificationSettingChannel> items = notificationAdvancedSettings.getItems();
                        if (items != null) {
                            arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(items, i3));
                            for (NotificationSettingChannel notificationSettingChannel : items) {
                                java.lang.Integer msgType = notificationSettingChannel.getMsgType();
                                int iIntValue = msgType != null ? msgType.intValue() : 0;
                                java.lang.String msgName = notificationSettingChannel.getMsgName();
                                java.lang.String str5 = msgName == null ? "" : msgName;
                                java.util.List<SettingsChannel> channelStatus = notificationSettingChannel.getChannelStatus();
                                if (channelStatus != null) {
                                    listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(channelStatus, i3));
                                    for (SettingsChannel settingsChannel : channelStatus) {
                                        java.lang.Integer channelType = settingsChannel.getChannelType();
                                        int iIntValue2 = channelType != null ? channelType.intValue() : 0;
                                        java.lang.String channelName = settingsChannel.getChannelName();
                                        java.lang.String str6 = channelName == null ? "" : channelName;
                                        java.lang.Integer channelSwitch = settingsChannel.getChannelSwitch();
                                        listAhwBna.add(new SwitchItemInfo(iIntValue2, str6, (java.lang.String) null, (java.lang.String) null, false, channelSwitch != null && channelSwitch.intValue() == 1, (java.util.List) null, 92, (DefaultConstructorMarker) null));
                                    }
                                } else {
                                    listAhwBna = null;
                                }
                                if (listAhwBna == null) {
                                    listAhwBna = yDY.AhwBna();
                                }
                                arrayList2.add(new ModeSwitchGroupInfo(iIntValue, str5, (java.lang.String) null, listAhwBna, 4, (DefaultConstructorMarker) null));
                                i3 = 10;
                            }
                        } else {
                            arrayList2 = null;
                        }
                        arrayList3.add(new MessageSettingModeInfo(str, (java.lang.String) null, str2, str3, str4, zBooleanValue, arrayList2 == null ? yDY.AhwBna() : arrayList2, 2, (DefaultConstructorMarker) null));
                        i3 = 10;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                return arrayList == null ? yDY.AhwBna() : arrayList;
            }
            return yDY.AhwBna();
        } catch (java.lang.Exception unused) {
            return yDY.AhwBna();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<MsgSwitch>> continuation) throws java.lang.Throwable {
        MsgSwitchUseCaseImpl$getMessageSwitchList$1 msgSwitchUseCaseImpl$getMessageSwitchList$1;
        java.util.List listAhwBna;
        SettingsChannel settingsChannel;
        java.lang.Object next;
        if (continuation instanceof MsgSwitchUseCaseImpl$getMessageSwitchList$1) {
            msgSwitchUseCaseImpl$getMessageSwitchList$1 = (MsgSwitchUseCaseImpl$getMessageSwitchList$1) continuation;
            int i = msgSwitchUseCaseImpl$getMessageSwitchList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                msgSwitchUseCaseImpl$getMessageSwitchList$1.label = i - Integer.MIN_VALUE;
            } else {
                msgSwitchUseCaseImpl$getMessageSwitchList$1 = new MsgSwitchUseCaseImpl$getMessageSwitchList$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = msgSwitchUseCaseImpl$getMessageSwitchList$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = msgSwitchUseCaseImpl$getMessageSwitchList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C42600rYw c42600rYw = this.KWHzl;
            int type = AppNotificationBizType.CEFI.getType();
            msgSwitchUseCaseImpl$getMessageSwitchList$1.label = 1;
            objCopydefault = c42600rYw.copydefault(type, msgSwitchUseCaseImpl$getMessageSwitchList$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.List list = (java.util.List) ((ResponseData) objCopydefault).getData();
        java.util.ArrayList arrayList = null;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.util.List<NotificationSettingChannel> items = ((NotificationAdvancedSettings) it.next()).getItems();
                if (items != null) {
                    listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(items, 10));
                    for (NotificationSettingChannel notificationSettingChannel : items) {
                        java.util.List<SettingsChannel> channelStatus = notificationSettingChannel.getChannelStatus();
                        if (channelStatus != null) {
                            java.util.Iterator<T> it2 = channelStatus.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                java.lang.Integer channelType = ((SettingsChannel) next).getChannelType();
                                if (channelType != null && channelType.intValue() == 1) {
                                    break;
                                }
                            }
                            settingsChannel = (SettingsChannel) next;
                        } else {
                            settingsChannel = null;
                        }
                        listAhwBna.add(new MsgSwitch(notificationSettingChannel.getMsgType(), settingsChannel != null ? settingsChannel.getChannelSwitch() : null, (java.lang.Integer) null, 4, (DefaultConstructorMarker) null));
                    }
                } else {
                    listAhwBna = null;
                }
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                C56406yEe.KWHzl(arrayList2, listAhwBna);
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    /* JADX INFO: renamed from: o.rZb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rZb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
