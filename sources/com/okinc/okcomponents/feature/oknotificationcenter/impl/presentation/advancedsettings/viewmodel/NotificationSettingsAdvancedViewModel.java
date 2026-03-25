package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationAdvancedSettings;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SettingsChannel;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SystemNotificationExample;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C33129mqd;
import o.C42584rYg;
import o.rXY;
import o.rYN;
import o.rZP;
import o.rZQ;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationSettingsAdvancedViewModel extends ViewModel {
    public final StateFlow<C42584rYg<NotificationAdvancedSettings>> AEQbTJ;
    public int EZpvd;
    public final rXY KWHzl;
    public final MutableStateFlow<C42584rYg<NotificationAdvancedSettings>> OLrzqt;
    public final rYN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C42584rYg<NotificationAdvancedSettings>> OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public NotificationSettingsAdvancedViewModel(@NotNull rYN ryn, @NotNull rXY rxy) {
        Intrinsics.checkNotNullParameter(ryn, "");
        Intrinsics.checkNotNullParameter(rxy, "");
        this.copydefault = ryn;
        this.KWHzl = rxy;
        MutableStateFlow<C42584rYg<NotificationAdvancedSettings>> MutableStateFlow = StateFlowKt.MutableStateFlow(new C42584rYg(false, null, false, false, false, false, 63, null));
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        this.EZpvd = AppNotificationBizType.CEFI.getType();
    }

    public static /* synthetic */ void setup$default(NotificationSettingsAdvancedViewModel notificationSettingsAdvancedViewModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = AppNotificationBizType.CEFI.getType();
        }
        notificationSettingsAdvancedViewModel.EZpvd(i);
    }

    public final void copydefault() {
        MutableStateFlow<C42584rYg<NotificationAdvancedSettings>> mutableStateFlow = this.OLrzqt;
        mutableStateFlow.setValue(new C42584rYg<>(mutableStateFlow.getValue().OLrzqt().isEmpty(), null, false, false, true, false, 46, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationSettingsAdvancedViewModel$refreshNotificationAdvancedSettings$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Object> OLrzqt(@NotNull List<NotificationAdvancedSettings> list) {
        boolean z;
        NotificationSettingChannel notificationSettingChannel;
        boolean z2;
        Boolean boolValueOf;
        boolean z3;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        for (NotificationAdvancedSettings notificationAdvancedSettings : list) {
            if (Intrinsics.EZpvd(notificationAdvancedSettings.getShowItemsUnderCategory(), Boolean.TRUE)) {
                String categoryName = notificationAdvancedSettings.getCategoryName();
                String str = categoryName == null ? "" : categoryName;
                String categoryDetail = notificationAdvancedSettings.getCategoryDetail();
                arrayList.add(new rZQ(null, str, categoryDetail == null ? "" : categoryDetail, notificationAdvancedSettings.getLightIconLink(), notificationAdvancedSettings.getDarkIconLink(), true, false));
                List<NotificationSettingChannel> items = notificationAdvancedSettings.getItems();
                if (items != null) {
                    for (NotificationSettingChannel notificationSettingChannel2 : items) {
                        List<NotificationSettingChannel> subItems = notificationSettingChannel2.getSubItems();
                        if (subItems != null && subItems.isEmpty()) {
                            List<SettingsChannel> channelStatus = notificationSettingChannel2.getChannelStatus();
                            if (channelStatus != null) {
                                if (!channelStatus.isEmpty()) {
                                    Iterator<T> it = channelStatus.iterator();
                                    while (it.hasNext()) {
                                        Integer channelSwitch = ((SettingsChannel) it.next()).getChannelSwitch();
                                        if (channelSwitch == null || channelSwitch.intValue() != 0) {
                                            z3 = false;
                                            break;
                                        }
                                    }
                                    z3 = true;
                                    boolValueOf = Boolean.valueOf(z3);
                                } else {
                                    z3 = true;
                                    boolValueOf = Boolean.valueOf(z3);
                                }
                            }
                        } else {
                            List<NotificationSettingChannel> subItems2 = notificationSettingChannel2.getSubItems();
                            if (subItems2 == null) {
                                boolValueOf = null;
                            } else if (!subItems2.isEmpty()) {
                                Iterator<T> it2 = subItems2.iterator();
                                while (it2.hasNext()) {
                                    List<SettingsChannel> channelStatus2 = ((NotificationSettingChannel) it2.next()).getChannelStatus();
                                    if (channelStatus2 != null) {
                                        if (!channelStatus2.isEmpty()) {
                                            Iterator<T> it3 = channelStatus2.iterator();
                                            while (it3.hasNext()) {
                                                Integer channelSwitch2 = ((SettingsChannel) it3.next()).getChannelSwitch();
                                                if (channelSwitch2 != null && channelSwitch2.intValue() == 0) {
                                                }
                                            }
                                        }
                                    }
                                    z2 = false;
                                }
                                z2 = true;
                                boolValueOf = Boolean.valueOf(z2);
                            } else {
                                z2 = true;
                                boolValueOf = Boolean.valueOf(z2);
                            }
                        }
                        Integer msgType = notificationSettingChannel2.getMsgType();
                        String msgName = notificationSettingChannel2.getMsgName();
                        String str2 = msgName == null ? "" : msgName;
                        String msgDetail = notificationSettingChannel2.getMsgDetail();
                        arrayList.add(new rZQ(msgType, str2, msgDetail == null ? "" : msgDetail, null, null, true, Intrinsics.EZpvd(boolValueOf, Boolean.TRUE)));
                    }
                }
            } else {
                List<NotificationSettingChannel> items2 = notificationAdvancedSettings.getItems();
                Integer msgType2 = (items2 == null || (notificationSettingChannel = (NotificationSettingChannel) CollectionsKt___CollectionsKt.firstOrNull(items2)) == null) ? null : notificationSettingChannel.getMsgType();
                String categoryName2 = notificationAdvancedSettings.getCategoryName();
                String str3 = categoryName2 == null ? "" : categoryName2;
                String categoryDetail2 = notificationAdvancedSettings.getCategoryDetail();
                String str4 = categoryDetail2 == null ? "" : categoryDetail2;
                String lightIconLink = notificationAdvancedSettings.getLightIconLink();
                String darkIconLink = notificationAdvancedSettings.getDarkIconLink();
                List<NotificationSettingChannel> items3 = notificationAdvancedSettings.getItems();
                if (items3 == null) {
                    z = false;
                    arrayList.add(new rZQ(msgType2, str3, str4, lightIconLink, darkIconLink, false, z));
                } else {
                    if (!items3.isEmpty()) {
                        Iterator<T> it4 = items3.iterator();
                        while (it4.hasNext()) {
                            List<SettingsChannel> channelStatus3 = ((NotificationSettingChannel) it4.next()).getChannelStatus();
                            if (channelStatus3 != null) {
                                if (!channelStatus3.isEmpty()) {
                                    Iterator<T> it5 = channelStatus3.iterator();
                                    while (it5.hasNext()) {
                                        Integer channelSwitch3 = ((SettingsChannel) it5.next()).getChannelSwitch();
                                        if (channelSwitch3 != null && channelSwitch3.intValue() == 0) {
                                        }
                                    }
                                }
                            }
                            z = false;
                        }
                    }
                    z = true;
                    arrayList.add(new rZQ(msgType2, str3, str4, lightIconLink, darkIconLink, false, z));
                }
            }
            arrayList.add(new rZP(0.0f, 0.0f, 3, null));
        }
        return (C33129mqd.KWHzl((Collection) arrayList) && (CollectionsKt___CollectionsKt.AubY(arrayList) instanceof rZP)) ? CollectionsKt___CollectionsKt.AYXKKw((List) arrayList, 1) : arrayList;
    }

    public final NotificationSettingChannel AEQbTJ(int i) {
        List<NotificationSettingChannel> subItems;
        Iterator<T> it = this.OLrzqt.getValue().OLrzqt().iterator();
        while (it.hasNext()) {
            List<NotificationSettingChannel> items = ((NotificationAdvancedSettings) it.next()).getItems();
            if (items != null) {
                for (NotificationSettingChannel notificationSettingChannel : items) {
                    Integer msgType = notificationSettingChannel.getMsgType();
                    if (msgType != null && msgType.intValue() == i) {
                        rXY rxy = this.KWHzl;
                        String msgName = notificationSettingChannel.getMsgName();
                        if (msgName == null) {
                            msgName = "";
                        }
                        rxy.EZpvd(msgName);
                        List<NotificationSettingChannel> subItems2 = notificationSettingChannel.getSubItems();
                        if ((subItems2 == null || !subItems2.isEmpty()) && (subItems = notificationSettingChannel.getSubItems()) != null) {
                            for (NotificationSettingChannel notificationSettingChannel2 : subItems) {
                                notificationSettingChannel2.setMsgExample(new SystemNotificationExample(null, null, null, null, null, 31, null));
                                notificationSettingChannel2.setSubItems(yDY.AhwBna());
                            }
                        }
                        return notificationSettingChannel;
                    }
                }
            }
        }
        return null;
    }
}
