package o;

import androidx.databinding.DataBindingUtil;
import com.okinc.kline.ui.view.KlineTipsViewTradePos$formatDataInBackground$2;
import com.okinc.kline.ui.view.KlineTipsViewTradePos$setData$1;
import java.math.BigDecimal;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.C32392mcI;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.pzC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39797pzC extends android.widget.FrameLayout {
    public final java.lang.String AEQbTJ;
    public final boolean AYXKKw;
    public final CoroutineScope AhwBna;
    public AbstractC32400mcQ AkhnZx;
    public final int DbNXlk;
    public final java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public BigDecimal djBIcL;
    public final int fetchVPNInfo;
    public final C36246oUr gEmmrt;
    public final int isConnected;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39797pzC(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:35) call: o.pzC.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C39797pzC(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39797pzC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = "KlineTipsViewTradePos";
        this.OLrzqt = Marker.ANY_NON_NULL_MARKER;
        this.AEQbTJ = "--";
        this.EZpvd = "cross";
        this.AkhnZx = (AbstractC32400mcQ) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C32392mcI.StateListAnimator.copydefault, this, true);
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        this.gEmmrt = c36246oUrCopydefault;
        this.valueOf = C55296xhK.OLrzqt(context);
        this.AYXKKw = c36246oUrCopydefault.QIZEnU();
        this.fetchVPNInfo = c36246oUrCopydefault.iZzfmt();
        this.isConnected = c36246oUrCopydefault.giSNqX();
        this.DbNXlk = c36246oUrCopydefault.gkJEwt();
        this.AhwBna = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        setupRtlLayout();
    }

    public final void setupRtlLayout() {
        if (this.valueOf) {
            this.AkhnZx.OLrzqt.setLayoutDirection(1);
            this.AkhnZx.AEQbTJ.setLayoutDirection(1);
            this.AkhnZx.copydefault.setLayoutDirection(1);
            this.AkhnZx.EZpvd.setLayoutDirection(1);
            this.AkhnZx.KWHzl.setLayoutDirection(1);
        }
    }

    public final void setData(@NotNull InterfaceC39510pth interfaceC39510pth) {
        Intrinsics.checkNotNullParameter(interfaceC39510pth, "");
        BuildersKt__Builders_commonKt.launch$default(this.AhwBna, null, null, new KlineTipsViewTradePos$setData$1(this, interfaceC39510pth, null), 3, null);
    }

    public final java.lang.Object AEQbTJ(InterfaceC39510pth interfaceC39510pth, Continuation<? super TaskDescription> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new KlineTipsViewTradePos$formatDataInBackground$2(this, interfaceC39510pth, null), continuation);
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = pTB.formatLocalized$default(str, null, 1, null) + " " + str2;
        Intrinsics.checkNotNullExpressionValue(str3, "");
        return str3;
    }

    public final void KWHzl(TaskDescription taskDescription, InterfaceC39510pth interfaceC39510pth) {
        java.lang.String strAYXKKw;
        if (this.AYXKKw) {
            this.AkhnZx.OLrzqt.setVisibility(8);
            this.AkhnZx.AEQbTJ.setVisibility(0);
        } else {
            this.AkhnZx.OLrzqt.setVisibility(0);
            this.AkhnZx.AEQbTJ.setVisibility(8);
        }
        this.AkhnZx.AkhnZx.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.dxcTrN));
        this.AkhnZx.DbNXlk.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.DXXBbs));
        this.AkhnZx.values.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.sVXHln));
        this.AkhnZx.gEmmrt.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.dLBcXg));
        this.AkhnZx.AYXKKw.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.RlQdEF));
        this.AkhnZx.fetchVPNInfo.setTextColor(taskDescription.AEQbTJ());
        this.AkhnZx.isConnected.setTextColor(taskDescription.copydefault());
        android.widget.TextView textView = this.AkhnZx.fetchVPNInfo;
        if (C33129mqd.AEQbTJ(interfaceC39510pth.getUpl(), 0)) {
            strAYXKKw = this.OLrzqt + taskDescription.AYXKKw();
        } else {
            strAYXKKw = taskDescription.AYXKKw();
        }
        textView.setText(strAYXKKw);
        this.AkhnZx.isConnected.setText(taskDescription.OLrzqt());
        this.AkhnZx.valueOf.setText(taskDescription.KWHzl());
        this.AkhnZx.djBIcL.setText(taskDescription.EZpvd());
        setVisibility(0);
    }

    /* JADX INFO: renamed from: o.pzC$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final int EZpvd;
        public final int KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = taskDescription.valueOf;
            }
            if ((i3 & 2) != 0) {
                str2 = taskDescription.OLrzqt;
            }
            java.lang.String str5 = str2;
            if ((i3 & 4) != 0) {
                str3 = taskDescription.AEQbTJ;
            }
            java.lang.String str6 = str3;
            if ((i3 & 8) != 0) {
                str4 = taskDescription.copydefault;
            }
            java.lang.String str7 = str4;
            if ((i3 & 16) != 0) {
                i = taskDescription.EZpvd;
            }
            int i4 = i;
            if ((i3 & 32) != 0) {
                i2 = taskDescription.KWHzl;
            }
            return taskDescription.copydefault(str, str5, str6, str7, i4, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new TaskDescription(str, str2, str3, str4, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) taskDescription.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && this.EZpvd == taskDescription.EZpvd && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.valueOf.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FormatData(uplStr=" + this.valueOf + ", uplRatioStr=" + this.OLrzqt + ", marginStr=" + this.AEQbTJ + ", liquidationPriceStr=" + this.copydefault + ", uplColor=" + this.EZpvd + ", uplRatioColor=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.valueOf = str;
            this.OLrzqt = str2;
            this.AEQbTJ = str3;
            this.copydefault = str4;
            this.EZpvd = i;
            this.KWHzl = i2;
        }
    }
}
