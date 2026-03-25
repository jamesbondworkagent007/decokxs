package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nbs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34429nbs extends ConstraintLayout {
    public boolean AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34429nbs(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setonPlatformClickListener(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:21) call: o.nbs.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C34429nbs(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34429nbs(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nbt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34429nbs.AEQbTJ(context, this);
            }
        });
    }

    private final C36084oOr KWHzl() {
        return (C36084oOr) this.EZpvd.getValue();
    }

    public static final C36084oOr AEQbTJ(android.content.Context context, C34429nbs c34429nbs) {
        return C36084oOr.KWHzl(android.view.LayoutInflater.from(context), c34429nbs);
    }

    public final void OLrzqt(@NotNull C34422nbl c34422nbl) {
        Intrinsics.checkNotNullParameter(c34422nbl, "");
        C36084oOr c36084oOrKWHzl = KWHzl();
        c36084oOrKWHzl.AEQbTJ.EZpvd(c34422nbl.valueOf());
        c36084oOrKWHzl.AEQbTJ.copydefault(c34422nbl.copydefault());
        C32243mUu c32243mUu = c36084oOrKWHzl.AEQbTJ;
        c32243mUu.setOnClickListener(new Application(c32243mUu, 1000L, this, c34422nbl));
        c36084oOrKWHzl.gEmmrt.setText(c34422nbl.AhwBna());
        c36084oOrKWHzl.copydefault.setText(c34422nbl.AYXKKw());
        copydefault(c34422nbl.OLrzqt());
        setPlatformTag(c34422nbl.EZpvd(), c34422nbl.KWHzl());
        boolean z = c34422nbl.AEQbTJ().length() > 0;
        this.AEQbTJ = z;
        if (z) {
            c36084oOrKWHzl.EZpvd.setDescription(c34422nbl.AEQbTJ());
        }
    }

    public final void setPlatformTag(java.lang.String str, java.lang.String str2) {
        C36084oOr c36084oOrKWHzl = KWHzl();
        if (str.length() == 0) {
            LinearLayoutCompat linearLayoutCompat = c36084oOrKWHzl.AhwBna;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(8);
            return;
        }
        LinearLayoutCompat linearLayoutCompat2 = c36084oOrKWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(0);
        c36084oOrKWHzl.AkhnZx.setText(str);
        android.widget.ImageView imageView = c36084oOrKWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        mUL.AEQbTJ(imageView, str2);
        mUO.setOnDoubleCheckClickListener$default(KWHzl().AhwBna, 0L, new Function1() { // from class: o.nbq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34429nbs.OLrzqt(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(C34429nbs c34429nbs, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = c34429nbs.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final void copydefault(java.lang.String str) {
        java.lang.String simpleDateTime$default;
        if (str.length() == 0) {
            KWHzl().OLrzqt.setVisibility(8);
            return;
        }
        long jValueOf = C33129mqd.valueOf(str);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        C55251xgS c55251xgS = KWHzl().OLrzqt;
        if (jCurrentTimeMillis - jValueOf < CalendarModelKt.MillisecondsIn24Hours) {
            simpleDateTime$default = KWHzl(str);
        } else {
            simpleDateTime$default = C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0) ? "--" : pTA.formatSimpleDateTime$default(new Date(jValueOf), null, 1, null);
        }
        c55251xgS.setText(simpleDateTime$default);
    }

    private final java.lang.String KWHzl(java.lang.String str) {
        return C34376nas.AEQbTJ.AEQbTJ(str, java.lang.System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: o.nbs$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C34422nbl EZpvd;
        public final /* synthetic */ C34429nbs OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C34429nbs c34429nbs, C34422nbl c34422nbl) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c34429nbs;
            this.EZpvd = c34422nbl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                mUO.EZpvd(context, this.EZpvd.gEmmrt());
            }
        }
    }
}
