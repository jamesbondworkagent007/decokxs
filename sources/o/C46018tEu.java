package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import com.okinc.planet.format.InstId;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.tRU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tEu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C46018tEu extends RecyclerView.ViewHolder {
    public final Function1<C46068tGq, Unit> AYXKKw;
    public final Function1<java.lang.String, Unit> AhwBna;
    public final Function0<Unit> OLrzqt;
    public final C46278tOk copydefault;
    public final Function1<C46068tGq, Unit> gEmmrt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.tGq, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.tGq, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46018tEu(@NotNull C46278tOk c46278tOk, @NotNull Function1<? super C46068tGq, Unit> function1, @NotNull Function1<? super C46068tGq, Unit> function12, @NotNull Function0<Unit> function0, Function1<? super java.lang.String, Unit> function13) {
        super(c46278tOk.getRoot());
        Intrinsics.checkNotNullParameter(c46278tOk, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = c46278tOk;
        this.gEmmrt = function1;
        this.AYXKKw = function12;
        this.OLrzqt = function0;
        this.AhwBna = function13;
    }

    public void OLrzqt(@NotNull final C46068tGq c46068tGq) {
        Intrinsics.checkNotNullParameter(c46068tGq, "");
        C46278tOk c46278tOk = this.copydefault;
        c46278tOk.AhwBna.setLabel(c46068tGq.fetchVPNInfo(), c46068tGq.KWHzl());
        tUA tua = c46278tOk.AhwBna;
        tua.setOnClickListener(new ActionBar(tua, 300L, tua, this, c46068tGq));
        c46278tOk.EZpvd.djBIcL.setHintClickListener(new Function0() { // from class: o.tEt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46018tEu.OLrzqt(this.copydefault, c46068tGq);
            }
        });
        boolean z = false;
        if (c46068tGq.fetchVPNInfo() == PlanetTradeTypes.Swap) {
            C55251xgS c55251xgS = c46278tOk.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(0);
            C55251xgS c55251xgS2 = c46278tOk.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
            c55251xgS2.setVisibility(0);
            C55251xgS c55251xgS3 = c46278tOk.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
            c55251xgS3.setVisibility(c46068tGq.AuCTel().length() > 0 ? 0 : 8);
            C55251xgS c55251xgS4 = c46278tOk.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c55251xgS4, "");
            C46044tFt.AEQbTJ(c55251xgS4, c46068tGq.AubY() instanceof tRU.ActionBar);
            c46278tOk.djBIcL.setText(c46068tGq.AubY().AEQbTJ());
            c46278tOk.gEmmrt.setText(c46068tGq.ejfBZ());
            c46278tOk.AEQbTJ.setText(c46068tGq.AuCTel());
            AppCompatImageView appCompatImageView = c46278tOk.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            tRT.OLrzqt(appCompatImageView);
        } else {
            AppCompatImageView appCompatImageView2 = c46278tOk.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            tRT.KWHzl(appCompatImageView2);
            java.lang.String strEZpvd = tRQ.EZpvd(InstId.EZpvd(c46068tGq.values()));
            if (strEZpvd != null) {
                AppCompatImageView appCompatImageView3 = c46278tOk.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
                tRE.EZpvd(appCompatImageView3, strEZpvd);
            }
        }
        ConstraintLayout root = c46278tOk.AkhnZx.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(c46068tGq.zLjUOn() ? 0 : 8);
        if (c46068tGq.zLjUOn()) {
            ConstraintLayout root2 = c46278tOk.AkhnZx.getRoot();
            root2.setOnClickListener(new Application(root2, 1000L, this));
            final tUE tue = c46278tOk.AkhnZx.KWHzl;
            android.content.Context context = tue.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            float fEZpvd = C55298xhM.EZpvd(16.0f, context);
            C46451tUv c46451tUvOLrzqt = C46451tUv.Companion.OLrzqt();
            android.content.Context context2 = tue.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c46451tUvOLrzqt.copydefault(context2, (int) fEZpvd, new Function1() { // from class: o.tEA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46018tEu.copydefault(tue, (android.graphics.drawable.Drawable) obj);
                }
            });
            tue.setText(C33069mpW.copydefault(C47501trL.Fragment.sbu, C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", c46068tGq.fARcdN()), C56390yDp.OLrzqt("ccy", c46068tGq.hDKMBd()), C56390yDp.OLrzqt("type", c46068tGq.getNewProxyInstance()))));
            android.widget.TextView textView = c46278tOk.AkhnZx.EZpvd;
            java.lang.Integer btnText = c46068tGq.getFieldNames().getBtnText();
            textView.setText(btnText != null ? C33070mpX.AYXKKw(btnText.intValue()) : null);
        }
        c46278tOk.fetchVPNInfo.setText(c46068tGq.AEQbTJ());
        c46278tOk.EZpvd.djBIcL.setContentColor(c46068tGq.AYXKKw());
        c46278tOk.EZpvd.AhwBna.setContentColor(c46068tGq.valueOf());
        c46278tOk.EZpvd.copydefault.setContent(c46068tGq.copydefault());
        c46278tOk.EZpvd.djBIcL.setContent(c46068tGq.OLrzqt());
        c46278tOk.EZpvd.gEmmrt.setContent(c46068tGq.gEmmrt());
        c46278tOk.EZpvd.valueOf.setContent(c46068tGq.djBIcL());
        c46278tOk.EZpvd.AhwBna.setContent(c46068tGq.AhwBna());
        c46278tOk.EZpvd.values.setText(c46068tGq.iwGUEr());
        c46278tOk.EZpvd.KWHzl.setText(c46068tGq.EZpvd());
        C46466tVj c46466tVj = c46278tOk.EZpvd.valueOf;
        if (c46068tGq.fJNWhG() && C33129mqd.OLrzqt((java.lang.CharSequence) c46068tGq.fIwbmz())) {
            z = true;
        }
        c46466tVj.setHint(z);
        C46466tVj c46466tVj2 = c46278tOk.EZpvd.valueOf;
        if (c46068tGq.fJNWhG() && C33129mqd.OLrzqt((java.lang.CharSequence) c46068tGq.fIwbmz())) {
            c46466tVj2.setHintClickListener(new Function0() { // from class: o.tEx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46018tEu.copydefault(this.KWHzl, c46068tGq);
                }
            });
        } else {
            c46466tVj2.setHintClickListener(new Function0() { // from class: o.tEy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46018tEu.EZpvd();
                }
            });
        }
    }

    public static final Unit OLrzqt(C46018tEu c46018tEu, C46068tGq c46068tGq) {
        c46018tEu.AYXKKw.invoke(c46068tGq);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(tUE tue, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        tue.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C46018tEu c46018tEu, C46068tGq c46068tGq) {
        Function1<java.lang.String, Unit> function1 = c46018tEu.AhwBna;
        if (function1 != null) {
            function1.invoke(c46068tGq.fIwbmz());
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.tEu$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C46018tEu EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C46068tGq OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, android.view.View view2, C46018tEu c46018tEu, C46068tGq c46068tGq) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = view2;
            this.EZpvd = c46018tEu;
            this.OLrzqt = c46068tGq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.gEmmrt.invoke(this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.tEu$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C46018tEu copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C46018tEu c46018tEu) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c46018tEu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.OLrzqt.invoke();
            }
        }
    }
}
