package com.okinc.im.imui.messageV2.view.banner.groupannouncement;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.messageV2.view.banner.groupannouncement.GroupAnnouncementBannerViewModel;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32989mnw;
import o.C35750oCh;
import o.C35759oCq;
import o.C36551odB;
import o.oDG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupAnnouncementBannerViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final MutableLiveData<C32989mnw<String>> AEQbTJ;
    public final LiveData<Boolean> AYXKKw;
    public final LiveData<C36551odB> AhwBna;
    public final C35759oCq DbNXlk;
    public final MutableLiveData<Boolean> EZpvd;
    public final MutableLiveData<C32989mnw<GroupInfo>> KWHzl;
    public final MutableLiveData<String> OLrzqt;
    public final LiveData<GroupInfo> djBIcL;
    public final C35750oCh gEmmrt;
    public final LiveData<C32989mnw<String>> isConnected;
    public final oDG valueOf;
    public final MutableLiveData<C32989mnw<GroupInfo>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<GroupInfo> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> EZpvd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<GroupInfo>> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C36551odB> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public GroupAnnouncementBannerViewModel(@NotNull C35750oCh c35750oCh, @NotNull C35759oCq c35759oCq, @NotNull oDG odg) {
        Intrinsics.checkNotNullParameter(c35750oCh, "");
        Intrinsics.checkNotNullParameter(c35759oCq, "");
        Intrinsics.checkNotNullParameter(odg, "");
        this.gEmmrt = c35750oCh;
        this.DbNXlk = c35759oCq;
        this.valueOf = odg;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.EZpvd = mutableLiveData;
        this.AYXKKw = mutableLiveData;
        MutableLiveData<C32989mnw<String>> mutableLiveData2 = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData2;
        this.isConnected = mutableLiveData2;
        MutableLiveData<C32989mnw<GroupInfo>> mutableLiveData3 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData3;
        this.values = mutableLiveData3;
        MutableLiveData<String> mutableLiveData4 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData4;
        this.djBIcL = Transformations.switchMap(mutableLiveData4, new Function1() { // from class: o.ogK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return GroupAnnouncementBannerViewModel.EZpvd(this.KWHzl, (java.lang.String) obj);
            }
        });
        this.AhwBna = Transformations.distinctUntilChanged(Transformations.switchMap(mutableLiveData4, new Function1() { // from class: o.ogN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return GroupAnnouncementBannerViewModel.AEQbTJ(this.OLrzqt, (java.lang.String) obj);
            }
        }));
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.banner.groupannouncement.GroupAnnouncementBannerViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final LiveData EZpvd(GroupAnnouncementBannerViewModel groupAnnouncementBannerViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(groupAnnouncementBannerViewModel.valueOf.AEQbTJ(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final LiveData AEQbTJ(GroupAnnouncementBannerViewModel groupAnnouncementBannerViewModel, String str) {
        if (str == null) {
            return new MutableLiveData(null);
        }
        return FlowLiveDataConversions.asLiveData$default(groupAnnouncementBannerViewModel.gEmmrt.KWHzl(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final void AEQbTJ(String str) {
        this.OLrzqt.setValue(str);
    }

    public final void KWHzl() {
        C36551odB value = this.AhwBna.getValue();
        GroupInfo value2 = this.djBIcL.getValue();
        if (value == null || value2 == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupAnnouncementBannerViewModel$cancelGroupAnnouncementBanner$1(this, value2, value, null), 3, null);
    }

    public final void AYXKKw() {
        GroupInfo value = this.djBIcL.getValue();
        if (value != null) {
            this.KWHzl.setValue(new C32989mnw<>(value));
        }
    }
}
