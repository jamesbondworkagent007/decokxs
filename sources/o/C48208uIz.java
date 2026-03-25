package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uIz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48208uIz extends android.widget.FrameLayout {
    public final uMK KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C48208uIz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C48208uIz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:67) call: o.uIz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C48208uIz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48208uIz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        uMK umkCopydefault = uMK.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(umkCopydefault, "");
        this.KWHzl = umkCopydefault;
        this.OLrzqt = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.EZpvd, 0, 0);
        try {
            this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(C48033uCm.LoaderManager.KWHzl, true);
            OLrzqt();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: o.uIz$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        public final java.lang.String KWHzl;
        public final Function0<Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uIz$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                function0 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(str, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            Function0<Unit> function0 = this.OLrzqt;
            return (iHashCode * 31) + (function0 == null ? 0 : function0.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BotAssetsInfo(value=" + this.KWHzl + ", onClick=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
            this.OLrzqt = function0;
        }
    }

    /* JADX INFO: renamed from: o.uIz$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public final java.lang.Integer AEQbTJ;
        public final java.lang.Integer EZpvd;
        public final long KWHzl;
        public final java.lang.String OLrzqt;
        public final StateListAnimator copydefault;
        public final java.lang.Integer gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.lang.String str, long j, java.lang.String str2, StateListAnimator stateListAnimator, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, j, str2, stateListAnimator, num, num2, num3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && this.KWHzl == activity.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) activity.valueOf) && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, activity.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = java.lang.Long.hashCode(this.KWHzl);
            java.lang.String str = this.valueOf;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            StateListAnimator stateListAnimator = this.copydefault;
            int iHashCode4 = stateListAnimator == null ? 0 : stateListAnimator.hashCode();
            java.lang.Integer num = this.EZpvd;
            int iHashCode5 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.AEQbTJ;
            int iHashCode6 = num2 == null ? 0 : num2.hashCode();
            java.lang.Integer num3 = this.gEmmrt;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num3 != null ? num3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiModel(algoId=" + this.OLrzqt + ", creationTime=" + this.KWHzl + ", stoppedTime=" + this.valueOf + ", botAssets=" + this.copydefault + ", algoIdTitleRes=" + this.EZpvd + ", creationTimeTitleRes=" + this.AEQbTJ + ", stoppedTimeTitleRes=" + this.gEmmrt + ")";
        }

        public Activity(@NotNull java.lang.String str, long j, java.lang.String str2, StateListAnimator stateListAnimator, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
            this.KWHzl = j;
            this.valueOf = str2;
            this.copydefault = stateListAnimator;
            this.EZpvd = num;
            this.AEQbTJ = num2;
            this.gEmmrt = num3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:o.uIz$StateListAnimator:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.uIz$StateListAnimator) : (r16v0 o.uIz$StateListAnimator))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
 A[MD:(java.lang.String, long, java.lang.String, o.uIz$StateListAnimator, java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:118) call: o.uIz.Activity.<init>(java.lang.String, long, java.lang.String, o.uIz$StateListAnimator, java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, long j, java.lang.String str2, StateListAnimator stateListAnimator, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : stateListAnimator, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3);
        }
    }

    public final void setShowCardBackground(boolean z) {
        this.OLrzqt = z;
        OLrzqt();
    }

    public final void OLrzqt() {
        if (this.OLrzqt) {
            this.KWHzl.isConnected.setBackgroundResource(C48033uCm.ActionBar.valueOf);
            this.KWHzl.isConnected.setPadding(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.UeEOUB), getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fFgQHt), getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.UeEOUB), getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fFgQHt));
        } else {
            this.KWHzl.isConnected.setBackground(null);
            this.KWHzl.isConnected.setPadding(0, 0, 0, 0);
        }
    }

    public final void OLrzqt(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        uMK umk = this.KWHzl;
        java.lang.Integer numCopydefault = activity.copydefault();
        if (numCopydefault != null) {
            umk.valueOf.setText(numCopydefault.intValue());
        }
        java.lang.Integer numAhwBna = activity.AhwBna();
        if (numAhwBna != null) {
            umk.AuCTel.setText(numAhwBna.intValue());
        }
        java.lang.Integer numKWHzl = activity.KWHzl();
        if (numKWHzl != null) {
            umk.DbNXlk.setText(numKWHzl.intValue());
        }
        boolean z = activity.EZpvd() != null;
        LinearLayoutCompat linearLayoutCompat = umk.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(z ? 0 : 8);
        if (z) {
            umk.AEQbTJ.setText(activity.EZpvd().EZpvd());
            LinearLayoutCompat linearLayoutCompat2 = umk.copydefault;
            linearLayoutCompat2.setOnClickListener(new TaskDescription(linearLayoutCompat2, 1000L, activity));
        }
        umk.AYXKKw.setText(activity.AEQbTJ());
        LinearLayoutCompat linearLayoutCompat3 = umk.gEmmrt;
        linearLayoutCompat3.setOnClickListener(new Application(linearLayoutCompat3, 1000L, this, activity));
        umk.EZpvd.setText(AEQbTJ(java.lang.Long.valueOf(activity.OLrzqt())));
        java.lang.String strDjBIcL = activity.djBIcL();
        boolean z2 = !(strDjBIcL == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDjBIcL));
        LinearLayoutCompat linearLayoutCompat4 = umk.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
        linearLayoutCompat4.setVisibility(z2 ? 0 : 8);
        if (z2) {
            umk.AhwBna.setText(AEQbTJ(activity.djBIcL()));
        }
    }

    /* JADX INFO: renamed from: o.uIz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Activity AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C48208uIz OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C48208uIz c48208uIz, Activity activity) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c48208uIz;
            this.AEQbTJ = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.copydefault(this.AEQbTJ.AEQbTJ());
            }
        }
    }

    /* JADX INFO: renamed from: o.uIz$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ Activity AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Activity activity) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0<Unit> function0AEQbTJ = this.AEQbTJ.EZpvd().AEQbTJ();
                if (function0AEQbTJ != null) {
                    function0AEQbTJ.invoke();
                }
            }
        }
    }

    public final void copydefault(java.lang.String str) {
        java.lang.Object systemService = getContext().getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
            C55326xho.toast$default(C55688xof.Application.addQueueItem, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public final java.lang.String AEQbTJ(java.lang.Object obj) {
        return pTA.format$default(new Date(C33129mqd.valueOf(obj)), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null);
    }
}
