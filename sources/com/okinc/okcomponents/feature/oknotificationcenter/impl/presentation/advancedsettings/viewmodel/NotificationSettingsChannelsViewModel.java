package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SettingsChannel;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SystemNotificationExample;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C33129mqd;
import o.C42585rYh;
import o.C56403yEb;
import o.C56442yFn;
import o.rXV;
import o.rXY;
import o.rYM;
import o.rZP;
import o.rZS;
import o.rZV;
import o.rZY;
import o.rZZ;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationSettingsChannelsViewModel extends ViewModel {
    public final MutableStateFlow<Boolean> AEQbTJ;
    public final rYM AYXKKw;
    public final Flow<C42585rYh> AhwBna;
    public rZZ EZpvd;
    public final Channel<C42585rYh> KWHzl;
    public final StateFlow<Boolean> OLrzqt;
    public final MutableStateFlow<List<Object>> copydefault;
    public final StateFlow<List<Object>> gEmmrt;
    public final rXY valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<C42585rYh> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<Object>> copydefault() {
        return this.gEmmrt;
    }

    @yCM
    public NotificationSettingsChannelsViewModel(@NotNull rXY rxy, @NotNull rYM rym) {
        Intrinsics.checkNotNullParameter(rxy, "");
        Intrinsics.checkNotNullParameter(rym, "");
        this.valueOf = rxy;
        this.AYXKKw = rym;
        Channel<C42585rYh> channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.KWHzl = channelChannel$default;
        this.AhwBna = FlowKt.receiveAsFlow(channelChannel$default);
        MutableStateFlow<List<Object>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.copydefault = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.AEQbTJ = MutableStateFlow2;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final void OLrzqt(@NotNull NotificationSettingChannel notificationSettingChannel, int i) {
        Intrinsics.checkNotNullParameter(notificationSettingChannel, "");
        this.EZpvd = new rZZ(i, C33129mqd.AhwBna(notificationSettingChannel.getMsgType()));
        this.copydefault.setValue(OLrzqt(notificationSettingChannel));
    }

    public final void AEQbTJ(@NotNull rZY rzy, boolean z) {
        Intrinsics.checkNotNullParameter(rzy, "");
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationSettingsChannelsViewModel$updateChannelStatus$loadingJob$1(this, null), 3, null);
        rXY rxy = this.valueOf;
        String strEZpvd = rzy.EZpvd();
        String channelName = rzy.AEQbTJ().getChannelName();
        rxy.copydefault(strEZpvd, channelName != null ? channelName : "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationSettingsChannelsViewModel$updateChannelStatus$1(this, rzy, z, jobLaunch$default, null), 3, null);
    }

    public final void KWHzl(rZY rzy, boolean z) {
        MutableStateFlow<List<Object>> mutableStateFlow = this.copydefault;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.copydefault.getValue()) {
            if (obj instanceof rZY) {
                rZY rzy2 = (rZY) obj;
                if (Intrinsics.EZpvd(rzy2.AEQbTJ().getChannelType(), rzy.AEQbTJ().getChannelType())) {
                    String strEZpvd = rzy2.EZpvd();
                    arrayList.add(new rZY(SettingsChannel.copy$default(rzy2.AEQbTJ(), null, null, Integer.valueOf(!z ? 1 : 0), null, 11, null), rzy2.OLrzqt(), strEZpvd));
                }
            }
            arrayList.add(obj);
        }
        mutableStateFlow.setValue(arrayList);
    }

    public final void OLrzqt(Job job) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        this.AEQbTJ.setValue(Boolean.FALSE);
    }

    public final List<Object> OLrzqt(NotificationSettingChannel notificationSettingChannel) {
        List listAhwBna;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new rZS(rXV.TaskDescription.copydefault));
        List<NotificationSettingChannel> subItems = notificationSettingChannel.getSubItems();
        if (subItems == null) {
            subItems = yDY.AhwBna();
        }
        List listAhwBna2 = null;
        if (subItems.isEmpty()) {
            List<SettingsChannel> channelStatus = notificationSettingChannel.getChannelStatus();
            if (channelStatus != null) {
                listAhwBna2 = new ArrayList(C56403yEb.AYXKKw(channelStatus, 10));
                for (SettingsChannel settingsChannel : channelStatus) {
                    String msgName = notificationSettingChannel.getMsgName();
                    if (msgName == null) {
                        msgName = "";
                    }
                    listAhwBna2.add(new rZY(settingsChannel, C33129mqd.AhwBna(notificationSettingChannel.getMsgType()), msgName));
                }
            }
            if (listAhwBna2 == null) {
                listAhwBna2 = yDY.AhwBna();
            }
            arrayList.addAll(listAhwBna2);
        } else {
            List<NotificationSettingChannel> subItems2 = notificationSettingChannel.getSubItems();
            if (subItems2 != null) {
                for (NotificationSettingChannel notificationSettingChannel2 : subItems2) {
                    String msgName2 = notificationSettingChannel2.getMsgName();
                    if (msgName2 == null) {
                        msgName2 = "";
                    }
                    String msgDetail = notificationSettingChannel2.getMsgDetail();
                    if (msgDetail == null) {
                        msgDetail = "";
                    }
                    arrayList.add(new rZV(msgName2, msgDetail));
                    List<SettingsChannel> channelStatus2 = notificationSettingChannel2.getChannelStatus();
                    if (channelStatus2 != null) {
                        listAhwBna = new ArrayList(C56403yEb.AYXKKw(channelStatus2, 10));
                        for (SettingsChannel settingsChannel2 : channelStatus2) {
                            String msgName3 = notificationSettingChannel.getMsgName();
                            if (msgName3 == null) {
                                msgName3 = "";
                            }
                            listAhwBna.add(new rZY(settingsChannel2, C33129mqd.AhwBna(notificationSettingChannel2.getMsgType()), msgName3));
                        }
                    } else {
                        listAhwBna = null;
                    }
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    arrayList.addAll(listAhwBna);
                    arrayList.add(new rZP(12.0f, 12.0f));
                }
            }
            arrayList.remove(yDY.AuCTel(arrayList));
        }
        arrayList.add(new rZS(rXV.TaskDescription.AYXKKw));
        SystemNotificationExample msgExample = notificationSettingChannel.getMsgExample();
        if (msgExample != null) {
            arrayList.add(msgExample);
        }
        return arrayList;
    }

    public final Object copydefault(C42585rYh c42585rYh, Continuation<? super Unit> continuation) {
        Object objSend = this.KWHzl.send(c42585rYh, continuation);
        return objSend == C56442yFn.copydefault() ? objSend : Unit.INSTANCE;
    }
}
