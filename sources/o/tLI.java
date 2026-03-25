package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.planet.biz_userprofile.data.PlanetProfileShareBean;
import com.okinc.planet.biz_userprofile.view.share.PlanetProfileShareView$initShareView$1;
import com.okinc.planet.biz_userprofile.view.share.PlanetShareView;
import com.okinc.share.view.FootViewTheme;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.C47501trL;
import o.tLH;
import o.tLR;
import o.tLV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class tLI extends PlanetShareView<tOU> {
    public final AbstractActivityC33041mov AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final tLR.ActionBar valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/tLR; */
    @Override // com.okinc.planet.biz_userprofile.view.share.PlanetShareView
    /* JADX INFO: renamed from: EZpvd */
    public tLR.ActionBar copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.planet.biz_userprofile.view.share.PlanetShareView
    public AbstractActivityC33041mov OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.planet.biz_userprofile.view.share.PlanetShareView
    public java.lang.Object copydefault(@NotNull PlanetProfileShareBean planetProfileShareBean, boolean z, boolean z2, @NotNull Continuation<? super PlanetShareView.TaskDescription> continuation) {
        return copydefault(this, planetProfileShareBean, z, z2, continuation);
    }

    public tLI(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull tLR.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.AEQbTJ = abstractActivityC33041mov;
        this.valueOf = actionBar;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.tLL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tLI.KWHzl(this.AEQbTJ);
            }
        });
    }

    @Override // com.okinc.planet.biz_userprofile.view.share.PlanetShareView
    public PlanetShareView.OKIMShareParams valueOf() {
        int i = C47501trL.Fragment.Th;
        int i2 = C47501trL.Fragment.fXYAwm;
        IMMessageShareModel.CTAType cTAType = IMMessageShareModel.CTAType.FollowNow;
        int i3 = C47501trL.Fragment.RIuxYh;
        return new PlanetShareView.OKIMShareParams(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), true, cTAType, java.lang.Integer.valueOf(i3), null, PlanetShareView.OKIMShareParams.EcoBizName.Profile);
    }

    public tOU gEmmrt() {
        return (tOU) this.AYXKKw.getValue();
    }

    public static final tOU KWHzl(tLI tli) {
        tOU touOLrzqt = tOU.OLrzqt(android.view.LayoutInflater.from(tli.OLrzqt()));
        Intrinsics.checkNotNullExpressionValue(touOLrzqt, "");
        return touOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: djBIcL()Lcom/okinc/planet/biz_userprofile/view/share/PlanetShareView; */
    @Override // com.okinc.planet.biz_userprofile.view.share.PlanetShareView
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public tLI djBIcL() {
        if (this instanceof tLH) {
            tLH tlh = (tLH) this;
            return new tLH(tlh.OLrzqt(), tlh.copydefault());
        }
        if (this instanceof tLH.Activity) {
            tLH.Activity activity = (tLH.Activity) this;
            return new tLH.Activity(activity.OLrzqt(), activity.EZpvd());
        }
        return new tLI(OLrzqt(), copydefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: kotlin.jvm.internal.DefaultConstructorMarker */
    /* JADX DEBUG: Multi-variable search result rejected for r14v5, resolved type: kotlin.jvm.internal.DefaultConstructorMarker */
    /* JADX DEBUG: Multi-variable search result rejected for r14v6, resolved type: kotlin.jvm.internal.DefaultConstructorMarker */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object copydefault(tLI tli, PlanetProfileShareBean planetProfileShareBean, boolean z, boolean z2, Continuation<? super PlanetShareView.TaskDescription> continuation) throws java.lang.Throwable {
        PlanetProfileShareView$initShareView$1 planetProfileShareView$initShareView$1;
        java.lang.String str;
        android.content.Context context;
        tOU tou;
        java.lang.String strAYXKKw;
        int i;
        tLI tli2;
        boolean z3;
        PlanetProfileShareBean planetProfileShareBean2;
        tOU tou2;
        DefaultConstructorMarker defaultConstructorMarker;
        java.lang.String strValues;
        java.lang.String strValues2;
        java.lang.String strValues3;
        tLI tli3 = tli;
        PlanetProfileShareBean planetProfileShareBean3 = planetProfileShareBean;
        boolean z4 = z2;
        if (continuation instanceof PlanetProfileShareView$initShareView$1) {
            planetProfileShareView$initShareView$1 = (PlanetProfileShareView$initShareView$1) continuation;
            int i2 = planetProfileShareView$initShareView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                planetProfileShareView$initShareView$1.label = i2 - Integer.MIN_VALUE;
            } else {
                planetProfileShareView$initShareView$1 = new PlanetProfileShareView$initShareView$1(tli3, continuation);
            }
        }
        PlanetProfileShareView$initShareView$1 planetProfileShareView$initShareView$12 = planetProfileShareView$initShareView$1;
        java.lang.Object objCopydefault = planetProfileShareView$initShareView$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = planetProfileShareView$initShareView$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            tOU touGEmmrt = tli.gEmmrt();
            planetProfileShareBean.valueOf();
            str = "";
            context = null;
            touGEmmrt.valueOf.setTitle(new tLV.TaskDescription(C46196tLj.EZpvd.KWHzl(planetProfileShareBean3), C33070mpX.AYXKKw(C47501trL.Fragment.fvQaOB), 0, 0, z2, 12, null));
            java.lang.String strAkhnZx = planetProfileShareBean.AkhnZx();
            tou = touGEmmrt;
            if (strAkhnZx != null) {
                tou.valueOf.setTimestamp(strAkhnZx);
            }
            tou.valueOf.setTimestamp(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) planetProfileShareBean.gEmmrt())) {
                strAYXKKw = planetProfileShareBean.gEmmrt();
            } else {
                strAYXKKw = planetProfileShareBean.AYXKKw();
                if (strAYXKKw == null) {
                    strAYXKKw = str;
                }
            }
            android.widget.ImageView imageView = tou.valueOf.copydefault().EZpvd;
            if (z4) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                i = 1;
                layoutParams.width = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
                layoutParams.height = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
            } else {
                i = 1;
            }
            Intrinsics.copydefault(imageView);
            planetProfileShareView$initShareView$12.L$0 = tli3;
            planetProfileShareView$initShareView$12.L$1 = planetProfileShareBean3;
            planetProfileShareView$initShareView$12.L$2 = tou;
            planetProfileShareView$initShareView$12.L$3 = imageView;
            planetProfileShareView$initShareView$12.Z$0 = z4;
            planetProfileShareView$initShareView$12.label = i;
            if (tli3.OLrzqt(imageView, z, strAYXKKw, planetProfileShareView$initShareView$12) == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = planetProfileShareView$initShareView$12.Z$0;
                tou2 = (tOU) planetProfileShareView$initShareView$12.L$2;
                planetProfileShareBean2 = (PlanetProfileShareBean) planetProfileShareView$initShareView$12.L$1;
                tli2 = (tLI) planetProfileShareView$initShareView$12.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                str = "";
                defaultConstructorMarker = 0;
                tou2.OLrzqt.AEQbTJ.setImageDrawable((android.graphics.drawable.Drawable) objCopydefault);
                tLJ tlj = tou2.EZpvd;
                strValues = planetProfileShareBean2.values();
                if (strValues == null) {
                    strValues = str;
                }
                tlj.setQRCode(strValues);
                tlj.setTitle(C33069mpW.copydefault(C47501trL.Fragment.GFUIi, C56423yEv.EZpvd(C56390yDp.OLrzqt("nickname", C46196tLj.EZpvd.KWHzl(planetProfileShareBean2)))));
                strValues2 = planetProfileShareBean2.values();
                if (strValues2 == null) {
                    strValues2 = str;
                }
                java.lang.String str2 = str;
                tlj.setSubTitle(new Regex("^(http://|https://)").replace(strValues2, str2));
                if (z3) {
                    tlj.setTheme(FootViewTheme.FIXED_VIP);
                }
                ConstraintLayout constraintLayoutEZpvd = tli2.gEmmrt().EZpvd();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutEZpvd, str2);
                int id = tli2.gEmmrt().EZpvd.getId();
                strValues3 = planetProfileShareBean2.values();
                if (strValues3 == null) {
                    strValues3 = str2;
                }
                return new PlanetShareView.TaskDescription(constraintLayoutEZpvd, id, tLS.AEQbTJ(strValues3), defaultConstructorMarker);
            }
            boolean z5 = planetProfileShareView$initShareView$12.Z$0;
            tOU tou3 = (tOU) planetProfileShareView$initShareView$12.L$2;
            PlanetProfileShareBean planetProfileShareBean4 = (PlanetProfileShareBean) planetProfileShareView$initShareView$12.L$1;
            tLI tli4 = (tLI) planetProfileShareView$initShareView$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            z4 = z5;
            tli3 = tli4;
            str = "";
            context = null;
            tou = tou3;
            planetProfileShareBean3 = planetProfileShareBean4;
        }
        PlanetShareView.StateListAnimator stateListAnimator = new PlanetShareView.StateListAnimator(C46451tUv.getUrl$default(C46451tUv.Companion.EZpvd(), tli3.OLrzqt(), null, false, 6, null), C56443yFo.AEQbTJ(C55298xhM.dp2px$default(71.0f, context, 1, context)), C56443yFo.AEQbTJ(C55298xhM.dp2px$default(21.0f, context, 1, context)));
        AbstractActivityC33041mov abstractActivityC33041movOLrzqt = tli3.OLrzqt();
        planetProfileShareView$initShareView$12.L$0 = tli3;
        planetProfileShareView$initShareView$12.L$1 = planetProfileShareBean3;
        planetProfileShareView$initShareView$12.L$2 = tou;
        planetProfileShareView$initShareView$12.L$3 = context;
        planetProfileShareView$initShareView$12.Z$0 = z4;
        planetProfileShareView$initShareView$12.label = 2;
        objCopydefault = tli3.copydefault(stateListAnimator, abstractActivityC33041movOLrzqt, planetProfileShareView$initShareView$12);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        tli2 = tli3;
        z3 = z4;
        tOU tou4 = tou;
        planetProfileShareBean2 = planetProfileShareBean3;
        tou2 = tou4;
        defaultConstructorMarker = context;
        tou2.OLrzqt.AEQbTJ.setImageDrawable((android.graphics.drawable.Drawable) objCopydefault);
        tLJ tlj2 = tou2.EZpvd;
        strValues = planetProfileShareBean2.values();
        if (strValues == null) {
        }
        tlj2.setQRCode(strValues);
        tlj2.setTitle(C33069mpW.copydefault(C47501trL.Fragment.GFUIi, C56423yEv.EZpvd(C56390yDp.OLrzqt("nickname", C46196tLj.EZpvd.KWHzl(planetProfileShareBean2)))));
        strValues2 = planetProfileShareBean2.values();
        if (strValues2 == null) {
        }
        java.lang.String str22 = str;
        tlj2.setSubTitle(new Regex("^(http://|https://)").replace(strValues2, str22));
        if (z3) {
        }
        ConstraintLayout constraintLayoutEZpvd2 = tli2.gEmmrt().EZpvd();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutEZpvd2, str22);
        int id2 = tli2.gEmmrt().EZpvd.getId();
        strValues3 = planetProfileShareBean2.values();
        if (strValues3 == null) {
        }
        return new PlanetShareView.TaskDescription(constraintLayoutEZpvd2, id2, tLS.AEQbTJ(strValues3), defaultConstructorMarker);
    }

    public void KWHzl() {
        tOU touGEmmrt = gEmmrt();
        touGEmmrt.KWHzl.setVisibility(8);
        touGEmmrt.OLrzqt.getRoot().setVisibility(0);
        if (C55296xhK.OLrzqt(OLrzqt())) {
            touGEmmrt.OLrzqt.OLrzqt.setTranslationX(-C55298xhM.dp2pxFloat$default(60.0f, null, 1, null));
        }
    }
}
