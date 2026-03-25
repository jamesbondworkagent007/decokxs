package com.okinc.im.imui.messageV2.view.banner.grouplimitation;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.okinc.im.imui.messageV2.view.banner.grouplimitation.GroupLimitationBannerViewModel;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C33129mqd;
import o.C37760ozs;
import o.C44157sFk;
import o.oDG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupLimitationBannerViewModel extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final oDG AEQbTJ;
    public final LiveData<GroupInfo> EZpvd;
    public final MutableLiveData<String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<GroupInfo> EZpvd() {
        return this.EZpvd;
    }

    @yCM
    public GroupLimitationBannerViewModel(@NotNull oDG odg) {
        Intrinsics.checkNotNullParameter(odg, "");
        this.AEQbTJ = odg;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.EZpvd = Transformations.distinctUntilChanged(Transformations.switchMap(mutableLiveData, new Function1() { // from class: o.ogV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return GroupLimitationBannerViewModel.KWHzl(this.KWHzl, (java.lang.String) obj);
            }
        }));
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.banner.grouplimitation.GroupLimitationBannerViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final LiveData KWHzl(GroupLimitationBannerViewModel groupLimitationBannerViewModel, String str) {
        if (str == null) {
            return new MutableLiveData(null);
        }
        return FlowLiveDataConversions.asLiveData$default(groupLimitationBannerViewModel.AEQbTJ.AEQbTJ(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final void AEQbTJ(String str) {
        this.OLrzqt.setValue(str);
    }

    public final boolean copydefault() {
        GroupInfo value = this.EZpvd.getValue();
        return (value != null ? value.getIncreaseGroupStatus() : null) == InHouseIMSuperGroupConfig.IncreaseGroupStatus.IS_FULL;
    }

    public final int KWHzl() {
        GroupInfo value = this.EZpvd.getValue();
        return C33129mqd.AhwBna(value != null ? value.getGroupCapacity() : null);
    }

    public final void OLrzqt() {
        C37760ozs.EZpvd("KEY_UPGRADE_BANNER_DISMISS" + C44157sFk.KWHzl() + ((Object) this.OLrzqt.getValue()), Boolean.TRUE);
    }

    public final boolean AEQbTJ() {
        return C37760ozs.copydefault("KEY_UPGRADE_BANNER_DISMISS" + C44157sFk.KWHzl() + ((Object) this.OLrzqt.getValue()), false);
    }
}
