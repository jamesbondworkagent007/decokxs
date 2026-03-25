package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29055kmS extends android.widget.LinearLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29055kmS(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:25) call: o.kmS.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C29055kmS(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29055kmS(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kmT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29055kmS.EZpvd(context, this);
            }
        });
    }

    private final hFB OLrzqt() {
        return (hFB) this.AEQbTJ.getValue();
    }

    public static final hFB EZpvd(android.content.Context context, C29055kmS c29055kmS) {
        return hFB.copydefault(android.view.LayoutInflater.from(context), c29055kmS, true);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = java.lang.System.currentTimeMillis() - C33129mqd.valueOf(str2) < CalendarModelKt.MillisecondsIn24Hours;
        ConstraintLayout constraintLayout = OLrzqt().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(str.length() > 0 ? 0 : 8);
        OLrzqt().OLrzqt.setText(C25352ivB.OLrzqt(str));
        ConstraintLayout constraintLayout2 = OLrzqt().AEQbTJ;
        constraintLayout2.setOnClickListener(new Activity(constraintLayout2, 1000L, this, str));
        ConstraintLayout constraintLayout3 = OLrzqt().KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        constraintLayout3.setVisibility(str2.length() <= 0 ? 8 : 0);
        if (str2.length() > 0) {
            KWHzl(str2);
            OLrzqt().KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.kmR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29055kmS.KWHzl(this.AEQbTJ, str2, view);
                }
            });
        }
    }

    public static final void KWHzl(C29055kmS c29055kmS, java.lang.String str, android.view.View view) {
        c29055kmS.EZpvd = !c29055kmS.EZpvd;
        c29055kmS.KWHzl(str);
    }

    public final void KWHzl(java.lang.String str) {
        java.lang.String simpleDateTime$default;
        OLrzqt().djBIcL.setText(getContext().getString(this.EZpvd ? C23274hvD.Fragment.r8lambdamcLa5hzjxuexHpGdLt3kU1m1dA : C23274hvD.Fragment.ComponentActivityApi19Impl));
        AppCompatTextView appCompatTextView = OLrzqt().AYXKKw;
        if (this.EZpvd) {
            simpleDateTime$default = C28924kju.OLrzqt.AEQbTJ(str, java.lang.System.currentTimeMillis());
        } else {
            simpleDateTime$default = pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(str)), null, 1, null);
        }
        appCompatTextView.setText(simpleDateTime$default);
    }

    /* JADX INFO: renamed from: o.kmS$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C29055kmS OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C29055kmS c29055kmS, java.lang.String str) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c29055kmS;
            this.copydefault = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                int i = C23274hvD.Fragment.playFromMediaId;
                android.content.Context context = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                hSW.copyAddress$default(i, context, this.copydefault, null, null, 24, null);
            }
        }
    }
}
