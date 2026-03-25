package o;

import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.biz.model.SupportService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lSO extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<java.lang.String> AEQbTJ;
    public Function0<Unit> AYXKKw;
    public final MutableLiveData<C32989mnw<SupportService>> AhwBna;
    public final LiveData<java.lang.Boolean> AkhnZx;
    public final LiveData<C32989mnw<SupportService>> DbNXlk;
    public final MutableLiveData<java.lang.String> KWHzl;
    public final MutableLiveData<java.lang.Boolean> OLrzqt;
    public final MutableLiveData<java.lang.Boolean> copydefault;
    public final MutableLiveData<java.lang.String> djBIcL;
    public final LiveData<java.lang.String> fetchVPNInfo;
    public final LiveData<java.lang.Boolean> gEmmrt;
    public final LiveData<java.lang.String> valueOf;
    public final LiveData<java.lang.String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> copydefault() {
        return this.gEmmrt;
    }

    public lSO() {
        MutableLiveData<java.lang.String> mutableLiveData = new MutableLiveData<>();
        this.djBIcL = mutableLiveData;
        this.values = mutableLiveData;
        MutableLiveData<java.lang.String> mutableLiveData2 = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData2;
        this.fetchVPNInfo = mutableLiveData2;
        MutableLiveData<java.lang.String> mutableLiveData3 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData3;
        this.valueOf = mutableLiveData3;
        MutableLiveData<java.lang.Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.copydefault = mutableLiveData4;
        this.gEmmrt = mutableLiveData4;
        MutableLiveData<java.lang.Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData5;
        this.AkhnZx = mutableLiveData5;
        MutableLiveData<C32989mnw<SupportService>> mutableLiveData6 = new MutableLiveData<>();
        this.AhwBna = mutableLiveData6;
        this.DbNXlk = mutableLiveData6;
    }

    public final void EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.setValue(str);
        if (str2 != null) {
            this.KWHzl.setValue(str2);
        }
        if (str3 != null) {
            this.AEQbTJ.setValue(str3);
        }
        this.OLrzqt.setValue(java.lang.Boolean.valueOf(z));
        this.copydefault.setValue(java.lang.Boolean.valueOf(z2));
        this.AYXKKw = function0;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lSO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setOnClickListener(new TaskDescription(view, 1000L, this));
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ lSO OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, lSO lso) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = lso;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt.AYXKKw;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
