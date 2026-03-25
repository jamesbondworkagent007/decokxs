package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.dex.api.bean.TokenBase;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25266itV extends android.widget.FrameLayout {
    public C21587hEx OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25266itV(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25266itV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25266itV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    public final void KWHzl(final android.content.Context context) {
        C52794wYp c52794wYp;
        AppCompatImageView appCompatImageView;
        C52794wYp c52794wYp2;
        AppCompatTextView appCompatTextView;
        C21587hEx c21587hExOLrzqt = C21587hEx.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        this.OLrzqt = c21587hExOLrzqt;
        if (c21587hExOLrzqt != null && (appCompatTextView = c21587hExOLrzqt.AkhnZx) != null) {
            C25352ivB.setCompoundDrawables$default(appCompatTextView, C52761wXj.TaskDescription.OJuSTm, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.dvKsVJ), true, null, 16, null);
        }
        C21587hEx c21587hEx = this.OLrzqt;
        if (c21587hEx != null && (c52794wYp2 = c21587hEx.OLrzqt) != null) {
            C25352ivB.KWHzl(c52794wYp2, C33070mpX.KWHzl(C52761wXj.TaskDescription.ZxnNGp), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.gHZMYf));
        }
        C21587hEx c21587hEx2 = this.OLrzqt;
        if (c21587hEx2 != null && (appCompatImageView = c21587hEx2.AhwBna) != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(appCompatImageView, 0L, new Function1() { // from class: o.itY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25266itV.EZpvd(context, (android.view.View) obj);
                }
            }, 1, null);
        }
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.ZxnNGp);
        if (drawable != null) {
            drawable.setBounds(0, 0, C55298xhM.OLrzqt(16, context), C55298xhM.OLrzqt(16, context));
        }
        C21587hEx c21587hEx3 = this.OLrzqt;
        if (c21587hEx3 == null || (c52794wYp = c21587hEx3.OLrzqt) == null) {
            return;
        }
        TextViewCompat.setCompoundDrawablesRelative(c52794wYp, drawable, null, null, null);
    }

    public static final Unit EZpvd(android.content.Context context, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.copydefault(C23274hvD.Fragment.initializeReflectiveFields);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        C21983hTo c21983hTo;
        C21983hTo c21983hTo2;
        C21587hEx c21587hEx = this.OLrzqt;
        if (c21587hEx != null && (c21983hTo2 = c21587hEx.fetchVPNInfo) != null) {
            C21983hTo.loadLargeImage$default(c21983hTo2, str, null, 2, null);
        }
        C21587hEx c21587hEx2 = this.OLrzqt;
        if (c21587hEx2 == null || (c21983hTo = c21587hEx2.fetchVPNInfo) == null) {
            return;
        }
        C21983hTo.loadSmallImage$default(c21983hTo, str2, null, 2, null);
    }

    public final void setBaseTokenInfo(@NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        C21587hEx c21587hEx = this.OLrzqt;
        if (c21587hEx != null) {
            AEQbTJ(tokenBase.getTokenLogoUrl(), tokenBase.getChainLogoUrl());
            c21587hEx.AkhnZx.setText(tokenBase.getTokenSymbol());
            AppCompatTextView appCompatTextView = c21587hEx.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(Intrinsics.EZpvd((java.lang.Object) tokenBase.isNativeToken(), (java.lang.Object) "1") ^ true ? 0 : 8);
            c21587hEx.gEmmrt.setText(C25352ivB.OLrzqt(tokenBase.getTokenContractAddress()));
            AppCompatImageView appCompatImageView = c21587hEx.AhwBna;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(tokenBase.isHighRisk() ? 0 : 8);
        }
    }

    public final void EZpvd(java.lang.String str) {
        AppCompatTextView appCompatTextView;
        java.lang.String scientificCurrency$default = str != null ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, true, false, false, null, false, false, 500, null) : null;
        C21587hEx c21587hEx = this.OLrzqt;
        if (c21587hEx == null || (appCompatTextView = c21587hEx.DbNXlk) == null) {
            return;
        }
        appCompatTextView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.build) + ": " + scientificCurrency$default);
    }

    public final void copydefault(java.lang.String str) {
        AppCompatTextView appCompatTextView;
        java.lang.String scientificCurrency$default = str != null ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, true, false, false, null, false, false, 500, null) : null;
        C21587hEx c21587hEx = this.OLrzqt;
        if (c21587hEx == null || (appCompatTextView = c21587hEx.isConnected) == null) {
            return;
        }
        appCompatTextView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getDescription) + ": " + scientificCurrency$default);
    }

    public final void OLrzqt(java.lang.String str) {
        AppCompatTextView appCompatTextView;
        java.lang.String scientificCurrency$default = str != null ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, true, false, false, null, false, false, 500, null) : null;
        C21587hEx c21587hEx = this.OLrzqt;
        if (c21587hEx == null || (appCompatTextView = c21587hEx.valueOf) == null) {
            return;
        }
        appCompatTextView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.isSessionReady) + ": " + scientificCurrency$default);
    }

    public final void EZpvd(@NotNull Function0<Unit> function0) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(function0, "");
        C21587hEx c21587hEx = this.OLrzqt;
        if (c21587hEx == null || (c52794wYp = c21587hEx.OLrzqt) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, function0));
    }

    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        C21983hTo c21983hTo;
        Intrinsics.checkNotNullParameter(function0, "");
        C21587hEx c21587hEx = this.OLrzqt;
        if (c21587hEx == null || (c21983hTo = c21587hEx.fetchVPNInfo) == null) {
            return;
        }
        c21983hTo.setOnClickListener(new Application(c21983hTo, 1000L, function0));
    }

    public final void KWHzl(@NotNull Function0<Unit> function0) {
        AppCompatTextView appCompatTextView;
        Intrinsics.checkNotNullParameter(function0, "");
        C21587hEx c21587hEx = this.OLrzqt;
        if (c21587hEx == null || (appCompatTextView = c21587hEx.AkhnZx) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, function0));
    }

    /* JADX INFO: renamed from: o.itV$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.itV$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.itV$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.invoke();
            }
        }
    }
}
