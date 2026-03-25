package com.okinc.buysell.ui.result;

import android.view.View;
import android.widget.Checkable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.biz.model.SupportService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32989mnw;
import o.C55296xhK;
import o.lSS;
import o.mCZ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ConvertResultViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final MutableLiveData<C32989mnw<lSS>> AEQbTJ;
    public final MutableLiveData<C32989mnw<SupportService>> AYXKKw;
    public final LiveData<C32989mnw<lSS>> AhwBna;
    public Function0<Unit> AkhnZx;
    public final LiveData<String> DbNXlk;
    public final MutableLiveData<Boolean> EZpvd;
    public final MutableLiveData<String> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableLiveData<String> djBIcL;
    public final LiveData<String> ejfBZ;
    public final LiveData<C32989mnw<SupportService>> fARcdN;
    public final LiveData<Boolean> fetchVPNInfo;
    public final LiveData<String> gEmmrt;
    public final mCZ isConnected;
    public final MutableLiveData<String> valueOf;
    public final LiveData<Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<lSS>> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> valueOf() {
        return this.ejfBZ;
    }

    @yCM
    public ConvertResultViewModel(@NotNull mCZ mcz) {
        Intrinsics.checkNotNullParameter(mcz, "");
        this.isConnected = mcz;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.valueOf = mutableLiveData;
        this.ejfBZ = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.djBIcL = mutableLiveData2;
        this.DbNXlk = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData3;
        this.gEmmrt = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData4;
        this.fetchVPNInfo = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData5;
        this.values = mutableLiveData5;
        MutableLiveData<C32989mnw<lSS>> mutableLiveData6 = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData6;
        this.AhwBna = mutableLiveData6;
        MutableLiveData<C32989mnw<SupportService>> mutableLiveData7 = new MutableLiveData<>();
        this.AYXKKw = mutableLiveData7;
        this.fARcdN = mutableLiveData7;
    }

    public final void EZpvd(@NotNull String str, String str2, String str3, boolean z, boolean z2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.setValue(str);
        if (str2 != null) {
            this.KWHzl.setValue(str2);
        }
        if (str3 != null) {
            this.djBIcL.setValue(str3);
        }
        this.OLrzqt.setValue(Boolean.valueOf(z));
        this.EZpvd.setValue(Boolean.valueOf(z2));
        this.AkhnZx = function0;
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConvertResultViewModel$loadConvertOrderData$1(this, str, null), 3, null);
    }

    public final void OLrzqt(String str, String str2, String str3) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConvertResultViewModel$loadRecommendData$1(str, this, str2, str3, null), 3, null);
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ ConvertResultViewModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, ConvertResultViewModel convertResultViewModel) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = convertResultViewModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.copydefault.AkhnZx;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.result.ConvertResultViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void copydefault(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setOnClickListener(new StateListAnimator(view, 1000L, this));
    }
}
