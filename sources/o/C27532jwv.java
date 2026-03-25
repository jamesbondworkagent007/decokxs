package o;

import android.widget.CompoundButton;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27532jwv extends android.widget.LinearLayout {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public InterfaceC27531jwu AhwBna;
    public boolean EZpvd;
    public long KWHzl;
    public C23892iNe OLrzqt;
    public boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27532jwv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27532jwv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwitchCallback(@NotNull InterfaceC27531jwu interfaceC27531jwu) {
        Intrinsics.checkNotNullParameter(interfaceC27531jwu, "");
        this.AhwBna = interfaceC27531jwu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwitchEnable(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:10) call: o.jwv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27532jwv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: o.jwv$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jwv.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27532jwv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = true;
        setOrientation(0);
        C23892iNe c23892iNeCopydefault = C23892iNe.copydefault(android.view.LayoutInflater.from(context), this);
        this.OLrzqt = c23892iNeCopydefault;
        Intrinsics.copydefault(c23892iNeCopydefault);
        c23892iNeCopydefault.OLrzqt.setChecked(this.EZpvd);
        this.AEQbTJ = SPUtils.getBoolean("invest_v3_zap_guide_show_disable", false);
        setClickListenerInternal();
    }

    public final void setClickListenerInternal() {
        C55239xgG c55239xgG;
        C23892iNe c23892iNe = this.OLrzqt;
        if (c23892iNe == null || (c55239xgG = c23892iNe.OLrzqt) == null) {
            return;
        }
        c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.jwB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C27532jwv.setClickListenerInternal$lambda$0(this.copydefault, compoundButton, z);
            }
        });
    }

    public static final void setClickListenerInternal$lambda$0(C27532jwv c27532jwv, android.widget.CompoundButton compoundButton, boolean z) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (!c27532jwv.djBIcL || jCurrentTimeMillis - c27532jwv.KWHzl <= 1000) {
            C23892iNe c23892iNe = c27532jwv.OLrzqt;
            Intrinsics.copydefault(c23892iNe);
            c23892iNe.OLrzqt.setChecked(c27532jwv.EZpvd);
        } else {
            c27532jwv.OLrzqt();
            InterfaceC27531jwu interfaceC27531jwu = c27532jwv.AhwBna;
            if (interfaceC27531jwu != null) {
                interfaceC27531jwu.copydefault(z);
            }
            c27532jwv.EZpvd = z;
            c27532jwv.KWHzl = jCurrentTimeMillis;
        }
    }

    public final void OLrzqt() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        SPUtils.put("invest_v3_zap_guide_show_disable", java.lang.Boolean.TRUE);
        InterfaceC27531jwu interfaceC27531jwu = this.AhwBna;
        if (interfaceC27531jwu != null) {
            interfaceC27531jwu.AEQbTJ();
        }
    }
}
