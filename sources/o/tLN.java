package o;

import android.view.View;
import com.just.agentweb.DefaultWebClient;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import com.okinc.planet.biz_userprofile.data.PlanetProfileShareBean;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import com.okinc.planet.biz_userprofile.view.share.PlanetShareManager$displayLoading$2;
import com.okinc.planet.biz_userprofile.view.share.PlanetShareManager$handleShareBeanWithShortLinks$1;
import com.okinc.planet.biz_userprofile.view.share.PlanetShareManager$handleShareBeanWithShortLinks$2;
import com.okinc.planet.biz_userprofile.view.share.PlanetShareManager$share$2;
import com.okinc.planet.biz_userprofile.view.share.PlanetShareView;
import com.okinc.share.api.RedirectBehavior;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tLN {
    public final C46388tSm AEQbTJ;
    public final tKU EZpvd;
    public final tQV copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public static final java.lang.String KWHzl = "PlanetShareManager";

    public tLN(@NotNull tQV tqv, @NotNull tKU tku, @NotNull C46388tSm c46388tSm) {
        Intrinsics.checkNotNullParameter(tqv, "");
        Intrinsics.checkNotNullParameter(tku, "");
        Intrinsics.checkNotNullParameter(c46388tSm, "");
        this.copydefault = tqv;
        this.EZpvd = tku;
        this.AEQbTJ = c46388tSm;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tLN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final tLN OLrzqt() {
            return tPF.copydefault.gUEfcq();
        }
    }

    public final java.lang.String OLrzqt() {
        return C34703nhO.AEQbTJ() ? "OKTR" : "OKX";
    }

    public final java.lang.Object OLrzqt(@NotNull PlanetShareView<?> planetShareView, InterfaceC46198tLl interfaceC46198tLl, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objEZpvd = EZpvd(C56402yEa.EZpvd(planetShareView), interfaceC46198tLl, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01af A[Catch: all -> 0x0308, Exception -> 0x030a, TryCatch #0 {Exception -> 0x030a, blocks: (B:16:0x005b, B:66:0x023e, B:60:0x01fb, B:62:0x0201, B:67:0x024e, B:71:0x0257, B:74:0x0261, B:76:0x0267, B:79:0x0284, B:81:0x028a, B:84:0x029d, B:87:0x02a8, B:89:0x02ae, B:92:0x02cb, B:94:0x02d1, B:96:0x02e2, B:21:0x0096, B:57:0x01db, B:52:0x01a9, B:54:0x01af, B:59:0x01f1, B:24:0x00b4, B:46:0x0169, B:48:0x018f, B:51:0x0199, B:27:0x00d2, B:42:0x014a, B:38:0x0119), top: B:106:0x0029, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0201 A[Catch: all -> 0x0308, Exception -> 0x030a, TryCatch #0 {Exception -> 0x030a, blocks: (B:16:0x005b, B:66:0x023e, B:60:0x01fb, B:62:0x0201, B:67:0x024e, B:71:0x0257, B:74:0x0261, B:76:0x0267, B:79:0x0284, B:81:0x028a, B:84:0x029d, B:87:0x02a8, B:89:0x02ae, B:92:0x02cb, B:94:0x02d1, B:96:0x02e2, B:21:0x0096, B:57:0x01db, B:52:0x01a9, B:54:0x01af, B:59:0x01f1, B:24:0x00b4, B:46:0x0169, B:48:0x018f, B:51:0x0199, B:27:0x00d2, B:42:0x014a, B:38:0x0119), top: B:106:0x0029, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024e A[Catch: all -> 0x0308, Exception -> 0x030a, TRY_LEAVE, TryCatch #0 {Exception -> 0x030a, blocks: (B:16:0x005b, B:66:0x023e, B:60:0x01fb, B:62:0x0201, B:67:0x024e, B:71:0x0257, B:74:0x0261, B:76:0x0267, B:79:0x0284, B:81:0x028a, B:84:0x029d, B:87:0x02a8, B:89:0x02ae, B:92:0x02cb, B:94:0x02d1, B:96:0x02e2, B:21:0x0096, B:57:0x01db, B:52:0x01a9, B:54:0x01af, B:59:0x01f1, B:24:0x00b4, B:46:0x0169, B:48:0x018f, B:51:0x0199, B:27:0x00d2, B:42:0x014a, B:38:0x0119), top: B:106:0x0029, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01d8 -> B:57:0x01db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0236 -> B:66:0x023e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.List<? extends PlanetShareView<?>> list, InterfaceC46198tLl interfaceC46198tLl, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PlanetShareManager$share$2 planetShareManager$share$2;
        PlanetShareView<?> planetShareView;
        java.util.List<? extends PlanetShareView<?>> list2;
        AbstractActivityC33041mov abstractActivityC33041mov;
        tLN tln;
        java.util.List<PlanetShareView.TaskDescription> list3;
        java.util.List<? extends PlanetShareView<?>> list4;
        java.util.List<PlanetShareView.OKIMShareParams> list5;
        PlanetShareView<?> planetShareView2;
        java.util.List<? extends PlanetShareView<?>> list6;
        tLN tln2;
        PlanetProfileShareBean planetProfileShareBean;
        java.lang.String strCopydefault;
        boolean zValueOf;
        java.util.List<PlanetShareView.TaskDescription> list7;
        PlanetShareView<?> planetShareView3;
        tLN tln3;
        java.lang.String str;
        java.util.List<PlanetShareView.OKIMShareParams> list8;
        boolean z;
        PlanetProfileShareBean planetProfileShareBean2;
        java.util.List<? extends PlanetShareView<?>> list9;
        java.util.Iterator it;
        java.util.Iterator it2;
        java.util.List<PlanetShareView.OKIMShareParams> list10;
        PlanetShareView<?> planetShareView4;
        boolean z2;
        java.util.List<PlanetShareView.TaskDescription> list11;
        tLN tln4;
        PlanetProfileShareBean planetProfileShareBean3;
        java.lang.Integer numAYXKKw;
        java.lang.Integer numOLrzqt;
        java.lang.Integer numAEQbTJ;
        java.lang.Integer numKWHzl;
        if (continuation instanceof PlanetShareManager$share$2) {
            planetShareManager$share$2 = (PlanetShareManager$share$2) continuation;
            int i = planetShareManager$share$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetShareManager$share$2.label = i - Integer.MIN_VALUE;
            } else {
                planetShareManager$share$2 = new PlanetShareManager$share$2(this, continuation);
            }
        }
        java.lang.Object objKWHzl = planetShareManager$share$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetShareManager$share$2.label;
        try {
            try {
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                C55326xho.toastWithFailedIcon$default(tRK.EZpvd(e), 0, 1, (java.lang.Object) null);
            }
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                if (list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                planetShareView = (PlanetShareView) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
                AbstractActivityC33041mov abstractActivityC33041movOLrzqt = planetShareView.OLrzqt();
                planetShareManager$share$2.L$0 = this;
                list2 = list;
                planetShareManager$share$2.L$1 = list2;
                planetShareManager$share$2.L$2 = planetShareView;
                planetShareManager$share$2.L$3 = abstractActivityC33041movOLrzqt;
                planetShareManager$share$2.label = 1;
                if (AEQbTJ(abstractActivityC33041movOLrzqt, planetShareManager$share$2) == objCopydefault) {
                    return objCopydefault;
                }
                abstractActivityC33041mov = abstractActivityC33041movOLrzqt;
                tln = this;
            } else if (i2 == 1) {
                AbstractActivityC33041mov abstractActivityC33041mov2 = (AbstractActivityC33041mov) planetShareManager$share$2.L$3;
                planetShareView = (PlanetShareView) planetShareManager$share$2.L$2;
                java.util.List<? extends PlanetShareView<?>> list12 = (java.util.List) planetShareManager$share$2.L$1;
                tln = (tLN) planetShareManager$share$2.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                abstractActivityC33041mov = abstractActivityC33041mov2;
                list2 = list12;
            } else {
                if (i2 == 2) {
                    list5 = (java.util.List) planetShareManager$share$2.L$5;
                    list3 = (java.util.List) planetShareManager$share$2.L$4;
                    abstractActivityC33041mov = (AbstractActivityC33041mov) planetShareManager$share$2.L$3;
                    planetShareView2 = (PlanetShareView) planetShareManager$share$2.L$2;
                    list4 = (java.util.List) planetShareManager$share$2.L$1;
                    tln = (tLN) planetShareManager$share$2.L$0;
                    C56391yDq.AEQbTJ(objKWHzl);
                    PlanetProfileShareBean planetProfileShareBean4 = (PlanetProfileShareBean) ((AbstractC43419rot) objKWHzl).AEQbTJ();
                    planetShareManager$share$2.L$0 = tln;
                    planetShareManager$share$2.L$1 = list4;
                    planetShareManager$share$2.L$2 = planetShareView2;
                    planetShareManager$share$2.L$3 = abstractActivityC33041mov;
                    planetShareManager$share$2.L$4 = list3;
                    planetShareManager$share$2.L$5 = list5;
                    planetShareManager$share$2.label = 3;
                    objKWHzl = tln.KWHzl(planetProfileShareBean4, planetShareView2, abstractActivityC33041mov, planetShareManager$share$2);
                    if (objKWHzl != objCopydefault) {
                        return objCopydefault;
                    }
                    list6 = list4;
                    tln2 = tln;
                    kotlin.Pair pair = (kotlin.Pair) objKWHzl;
                    planetProfileShareBean = (PlanetProfileShareBean) pair.component1();
                    strCopydefault = ((TaskDescription) pair.component2()).copydefault();
                    zValueOf = tln2.EZpvd.valueOf();
                    boolean fieldNames = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames();
                    if (zValueOf) {
                        list7 = list3;
                        planetShareView3 = planetShareView2;
                        tln3 = tln2;
                        str = strCopydefault;
                        list8 = list5;
                        z = zValueOf;
                        planetProfileShareBean2 = planetProfileShareBean;
                        list9 = list6;
                        it = list6.iterator();
                        if (!it.hasNext()) {
                        }
                    }
                    it2 = list6.iterator();
                    list10 = list5;
                    planetShareView4 = planetShareView2;
                    z2 = zValueOf;
                    list11 = list3;
                    tln4 = tln2;
                    planetProfileShareBean3 = planetProfileShareBean;
                    if (it2.hasNext()) {
                    }
                    abstractActivityC33041mov.dismissLoading();
                    return Unit.INSTANCE;
                }
                if (i2 == 3) {
                    list5 = (java.util.List) planetShareManager$share$2.L$5;
                    list3 = (java.util.List) planetShareManager$share$2.L$4;
                    abstractActivityC33041mov = (AbstractActivityC33041mov) planetShareManager$share$2.L$3;
                    planetShareView2 = (PlanetShareView) planetShareManager$share$2.L$2;
                    list6 = (java.util.List) planetShareManager$share$2.L$1;
                    tln2 = (tLN) planetShareManager$share$2.L$0;
                    C56391yDq.AEQbTJ(objKWHzl);
                    kotlin.Pair pair2 = (kotlin.Pair) objKWHzl;
                    planetProfileShareBean = (PlanetProfileShareBean) pair2.component1();
                    strCopydefault = ((TaskDescription) pair2.component2()).copydefault();
                    zValueOf = tln2.EZpvd.valueOf();
                    boolean fieldNames2 = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames();
                    if (zValueOf && tln2.AEQbTJ.ejfBZ() && fieldNames2) {
                        list7 = list3;
                        planetShareView3 = planetShareView2;
                        tln3 = tln2;
                        str = strCopydefault;
                        list8 = list5;
                        z = zValueOf;
                        planetProfileShareBean2 = planetProfileShareBean;
                        list9 = list6;
                        it = list6.iterator();
                        if (!it.hasNext()) {
                        }
                    }
                    it2 = list6.iterator();
                    list10 = list5;
                    planetShareView4 = planetShareView2;
                    z2 = zValueOf;
                    list11 = list3;
                    tln4 = tln2;
                    planetProfileShareBean3 = planetProfileShareBean;
                    if (it2.hasNext()) {
                    }
                    abstractActivityC33041mov.dismissLoading();
                    return Unit.INSTANCE;
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = planetShareManager$share$2.Z$0;
                    PlanetShareView planetShareView5 = (PlanetShareView) planetShareManager$share$2.L$8;
                    java.util.Iterator it3 = (java.util.Iterator) planetShareManager$share$2.L$7;
                    java.lang.String str2 = (java.lang.String) planetShareManager$share$2.L$6;
                    planetProfileShareBean3 = (PlanetProfileShareBean) planetShareManager$share$2.L$5;
                    java.util.List<PlanetShareView.OKIMShareParams> list13 = (java.util.List) planetShareManager$share$2.L$4;
                    java.util.List<PlanetShareView.TaskDescription> list14 = (java.util.List) planetShareManager$share$2.L$3;
                    abstractActivityC33041mov = (AbstractActivityC33041mov) planetShareManager$share$2.L$2;
                    planetShareView4 = (PlanetShareView) planetShareManager$share$2.L$1;
                    tln4 = (tLN) planetShareManager$share$2.L$0;
                    C56391yDq.AEQbTJ(objKWHzl);
                    java.util.Iterator it4 = it3;
                    PlanetShareView planetShareView6 = planetShareView5;
                    list11 = list14;
                    list11.add((PlanetShareView.TaskDescription) objKWHzl);
                    list13.add(planetShareView6.valueOf());
                    strCopydefault = str2;
                    it2 = it4;
                    list10 = list13;
                    if (it2.hasNext()) {
                        PlanetShareView planetShareView7 = (PlanetShareView) it2.next();
                        planetShareManager$share$2.L$0 = tln4;
                        planetShareManager$share$2.L$1 = planetShareView4;
                        planetShareManager$share$2.L$2 = abstractActivityC33041mov;
                        planetShareManager$share$2.L$3 = list11;
                        planetShareManager$share$2.L$4 = list10;
                        planetShareManager$share$2.L$5 = planetProfileShareBean3;
                        planetShareManager$share$2.L$6 = strCopydefault;
                        planetShareManager$share$2.L$7 = it2;
                        planetShareManager$share$2.L$8 = planetShareView7;
                        planetShareManager$share$2.L$9 = null;
                        planetShareManager$share$2.Z$0 = z2;
                        planetShareManager$share$2.label = 5;
                        java.lang.Object objInitShareView$default = PlanetShareView.initShareView$default(planetShareView7, planetProfileShareBean3, z2, false, planetShareManager$share$2, 4, null);
                        if (objInitShareView$default == objCopydefault) {
                            return objCopydefault;
                        }
                        str2 = strCopydefault;
                        objKWHzl = objInitShareView$default;
                        list13 = list10;
                        it4 = it2;
                        planetShareView6 = planetShareView7;
                        list11.add((PlanetShareView.TaskDescription) objKWHzl);
                        list13.add(planetShareView6.valueOf());
                        strCopydefault = str2;
                        it2 = it4;
                        list10 = list13;
                        if (it2.hasNext()) {
                            java.lang.String strValues = planetProfileShareBean3.values();
                            if (strValues == null) {
                                strValues = "";
                            }
                            java.lang.String str3 = strValues;
                            PlanetShareView.OKIMShareParams oKIMShareParams = (PlanetShareView.OKIMShareParams) CollectionsKt___CollectionsKt.firstOrNull(list10);
                            tln4.KWHzl(list11, abstractActivityC33041mov, str3, list10, new IMMessageShareModel((oKIMShareParams == null || (numKWHzl = oKIMShareParams.KWHzl()) == null) ? null : C33069mpW.copydefault(numKWHzl.intValue(), C56423yEv.EZpvd(C56390yDp.OLrzqt("kolname", C46196tLj.EZpvd.KWHzl(planetProfileShareBean3)))), (oKIMShareParams == null || (numAEQbTJ = oKIMShareParams.AEQbTJ()) == null) ? null : C33070mpX.OLrzqt(numAEQbTJ.intValue(), abstractActivityC33041mov), (oKIMShareParams == null || (numOLrzqt = oKIMShareParams.OLrzqt()) == null) ? null : C33069mpW.copydefault(numOLrzqt.intValue(), C56423yEv.EZpvd(C56390yDp.OLrzqt("kolname", C46196tLj.EZpvd.KWHzl(planetProfileShareBean3)))), (java.lang.String) null, (java.lang.String) null, strCopydefault, str3, (oKIMShareParams == null || (numAYXKKw = oKIMShareParams.AYXKKw()) == null) ? null : C33070mpX.OLrzqt(numAYXKKw.intValue(), abstractActivityC33041mov), oKIMShareParams != null ? oKIMShareParams.copydefault() : null, (java.util.Map) null, planetShareView4.valueOf().EZpvd().getCode(), 536, (DefaultConstructorMarker) null));
                        }
                    }
                    abstractActivityC33041mov.dismissLoading();
                    return Unit.INSTANCE;
                }
                z = planetShareManager$share$2.Z$0;
                PlanetShareView planetShareView8 = (PlanetShareView) planetShareManager$share$2.L$9;
                it = (java.util.Iterator) planetShareManager$share$2.L$8;
                str = (java.lang.String) planetShareManager$share$2.L$7;
                planetProfileShareBean2 = (PlanetProfileShareBean) planetShareManager$share$2.L$6;
                list8 = (java.util.List) planetShareManager$share$2.L$5;
                list7 = (java.util.List) planetShareManager$share$2.L$4;
                abstractActivityC33041mov = (AbstractActivityC33041mov) planetShareManager$share$2.L$3;
                planetShareView3 = (PlanetShareView) planetShareManager$share$2.L$2;
                list9 = (java.util.List) planetShareManager$share$2.L$1;
                tln3 = (tLN) planetShareManager$share$2.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                list7.add((PlanetShareView.TaskDescription) objKWHzl);
                list8.add(planetShareView8.valueOf());
                if (!it.hasNext()) {
                    planetShareView8 = (PlanetShareView) it.next();
                    PlanetShareView planetShareViewDjBIcL = planetShareView8.djBIcL();
                    planetShareManager$share$2.L$0 = tln3;
                    planetShareManager$share$2.L$1 = list9;
                    planetShareManager$share$2.L$2 = planetShareView3;
                    planetShareManager$share$2.L$3 = abstractActivityC33041mov;
                    planetShareManager$share$2.L$4 = list7;
                    planetShareManager$share$2.L$5 = list8;
                    planetShareManager$share$2.L$6 = planetProfileShareBean2;
                    planetShareManager$share$2.L$7 = str;
                    planetShareManager$share$2.L$8 = it;
                    planetShareManager$share$2.L$9 = planetShareView8;
                    planetShareManager$share$2.Z$0 = z;
                    planetShareManager$share$2.label = 4;
                    objKWHzl = planetShareViewDjBIcL.copydefault(planetProfileShareBean2, z, true, planetShareManager$share$2);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    list7.add((PlanetShareView.TaskDescription) objKWHzl);
                    list8.add(planetShareView8.valueOf());
                    if (!it.hasNext()) {
                        strCopydefault = str;
                        list6 = list9;
                        planetProfileShareBean = planetProfileShareBean2;
                        list3 = list7;
                        zValueOf = z;
                        tln2 = tln3;
                        list5 = list8;
                        planetShareView2 = planetShareView3;
                        it2 = list6.iterator();
                        list10 = list5;
                        planetShareView4 = planetShareView2;
                        z2 = zValueOf;
                        list11 = list3;
                        tln4 = tln2;
                        planetProfileShareBean3 = planetProfileShareBean;
                        if (it2.hasNext()) {
                        }
                        abstractActivityC33041mov.dismissLoading();
                        return Unit.INSTANCE;
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            tQV tqv = tln.copydefault;
            java.lang.String strKWHzl = planetShareView.copydefault().KWHzl();
            planetShareManager$share$2.L$0 = tln;
            planetShareManager$share$2.L$1 = list2;
            planetShareManager$share$2.L$2 = planetShareView;
            planetShareManager$share$2.L$3 = abstractActivityC33041mov;
            planetShareManager$share$2.L$4 = arrayList;
            planetShareManager$share$2.L$5 = arrayList2;
            planetShareManager$share$2.label = 2;
            java.lang.Object objDjBIcL = tqv.djBIcL(strKWHzl, planetShareManager$share$2);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
            PlanetShareView<?> planetShareView9 = planetShareView;
            list3 = arrayList;
            objKWHzl = objDjBIcL;
            list4 = list2;
            list5 = arrayList2;
            planetShareView2 = planetShareView9;
            PlanetProfileShareBean planetProfileShareBean42 = (PlanetProfileShareBean) ((AbstractC43419rot) objKWHzl).AEQbTJ();
            planetShareManager$share$2.L$0 = tln;
            planetShareManager$share$2.L$1 = list4;
            planetShareManager$share$2.L$2 = planetShareView2;
            planetShareManager$share$2.L$3 = abstractActivityC33041mov;
            planetShareManager$share$2.L$4 = list3;
            planetShareManager$share$2.L$5 = list5;
            planetShareManager$share$2.label = 3;
            objKWHzl = tln.KWHzl(planetProfileShareBean42, planetShareView2, abstractActivityC33041mov, planetShareManager$share$2);
            if (objKWHzl != objCopydefault) {
            }
        } catch (java.lang.Throwable th) {
            abstractActivityC33041mov.dismissLoading();
            throw th;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static java.lang.String AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static int EZpvd(java.lang.String str) {
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static java.lang.String KWHzl(java.lang.String str) {
            return "OriginalDeeplink(url=" + str + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final /* synthetic */ TaskDescription copydefault(java.lang.String str) {
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean copydefault(java.lang.String str, java.lang.Object obj) {
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((TaskDescription) obj).copydefault());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final /* synthetic */ java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            return copydefault(this.copydefault, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return EZpvd(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return KWHzl(this.copydefault);
        }

        /* JADX DEBUG: Marked for inline */
        /* JADX DEBUG: Method not inlined, still used in: [o.tLN.TaskDescription.copydefault(java.lang.String):o.tLN$TaskDescription] */
        public /* synthetic */ TaskDescription(java.lang.String str) {
            this.copydefault = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull PlanetProfileShareBean planetProfileShareBean, @NotNull PlanetShareView<?> planetShareView, @NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Continuation<? super kotlin.Pair<PlanetProfileShareBean, TaskDescription>> continuation) throws java.lang.Throwable {
        PlanetShareManager$handleShareBeanWithShortLinks$1 planetShareManager$handleShareBeanWithShortLinks$1;
        PlanetProfileShareBean planetProfileShareBean2;
        PlanetProfileShareBean planetProfileShareBean3;
        java.lang.String str;
        if (continuation instanceof PlanetShareManager$handleShareBeanWithShortLinks$1) {
            planetShareManager$handleShareBeanWithShortLinks$1 = (PlanetShareManager$handleShareBeanWithShortLinks$1) continuation;
            int i = planetShareManager$handleShareBeanWithShortLinks$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetShareManager$handleShareBeanWithShortLinks$1.label = i - Integer.MIN_VALUE;
            } else {
                planetShareManager$handleShareBeanWithShortLinks$1 = new PlanetShareManager$handleShareBeanWithShortLinks$1(this, continuation);
            }
        }
        PlanetShareManager$handleShareBeanWithShortLinks$1 planetShareManager$handleShareBeanWithShortLinks$12 = planetShareManager$handleShareBeanWithShortLinks$1;
        java.lang.Object objWithTimeoutOrNull = planetShareManager$handleShareBeanWithShortLinks$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetShareManager$handleShareBeanWithShortLinks$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithTimeoutOrNull);
            java.lang.String str2 = "://exchange/social/trade/personal?uniqueName=" + PlanetUniqueName.copydefault(planetShareView.copydefault().copydefault()) + "&authorId=" + PlanetAuthorId.EZpvd(planetShareView.copydefault().KWHzl()) + "&channel=share&location=feed";
            java.lang.String str3 = OLrzqt() + str2;
            java.lang.String lowerCase = OLrzqt().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(str3, lowerCase + str2);
            java.lang.String str4 = (java.lang.String) pairOLrzqt.component1();
            java.lang.String str5 = (java.lang.String) pairOLrzqt.component2();
            if (planetProfileShareBean.values() != null) {
                PlanetShareManager$handleShareBeanWithShortLinks$2 planetShareManager$handleShareBeanWithShortLinks$2 = new PlanetShareManager$handleShareBeanWithShortLinks$2(this, abstractActivityC33041mov, planetProfileShareBean, str4, null);
                planetShareManager$handleShareBeanWithShortLinks$12.L$0 = planetProfileShareBean;
                planetShareManager$handleShareBeanWithShortLinks$12.L$1 = str5;
                planetShareManager$handleShareBeanWithShortLinks$12.L$2 = planetProfileShareBean;
                planetShareManager$handleShareBeanWithShortLinks$12.label = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(3000L, planetShareManager$handleShareBeanWithShortLinks$2, planetShareManager$handleShareBeanWithShortLinks$12);
                if (objWithTimeoutOrNull == objCopydefault) {
                    return objCopydefault;
                }
                planetProfileShareBean2 = planetProfileShareBean;
                planetProfileShareBean3 = planetProfileShareBean2;
                str = str5;
            } else {
                return C56390yDp.OLrzqt(planetProfileShareBean, TaskDescription.copydefault(TaskDescription.AEQbTJ(str5)));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PlanetProfileShareBean planetProfileShareBean4 = (PlanetProfileShareBean) planetShareManager$handleShareBeanWithShortLinks$12.L$2;
            str = (java.lang.String) planetShareManager$handleShareBeanWithShortLinks$12.L$1;
            planetProfileShareBean2 = (PlanetProfileShareBean) planetShareManager$handleShareBeanWithShortLinks$12.L$0;
            C56391yDq.AEQbTJ(objWithTimeoutOrNull);
            planetProfileShareBean3 = planetProfileShareBean4;
        }
        java.lang.String strValues = (java.lang.String) objWithTimeoutOrNull;
        if (strValues == null) {
            strValues = planetProfileShareBean2.values();
        }
        return C56390yDp.OLrzqt(planetProfileShareBean3.EZpvd((4063 & 1) != 0 ? planetProfileShareBean3.portrait : null, (4063 & 2) != 0 ? planetProfileShareBean3.bio : null, (4063 & 4) != 0 ? planetProfileShareBean3.originalPortrait : null, (4063 & 8) != 0 ? planetProfileShareBean3.nickName : null, (4063 & 16) != 0 ? planetProfileShareBean3.enNickName : null, (4063 & 32) != 0 ? planetProfileShareBean3.qrCodeUrl : strValues, (4063 & 64) != 0 ? planetProfileShareBean3.followerCount : null, (4063 & 128) != 0 ? planetProfileShareBean3.postCount : null, (4063 & 256) != 0 ? planetProfileShareBean3.likes : null, (4063 & 512) != 0 ? planetProfileShareBean3.serverTime : null, (4063 & 1024) != 0 ? planetProfileShareBean3.pnlRatio : null, (4063 & 2048) != 0 ? planetProfileShareBean3.yieldCurve : null), TaskDescription.copydefault(TaskDescription.AEQbTJ(str)));
    }

    public final void KWHzl(java.util.List<PlanetShareView.TaskDescription> list, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.util.List<PlanetShareView.OKIMShareParams> list2, IMMessageShareModel iMMessageShareModel) {
        if (list.isEmpty()) {
            return;
        }
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                PlanetShareView.TaskDescription taskDescription = (PlanetShareView.TaskDescription) obj;
                AEQbTJ(taskDescription.EZpvd(), true);
                android.graphics.Bitmap bitmapAEQbTJ = C33570myu.AEQbTJ(taskDescription.EZpvd(), true);
                java.io.File fileAEQbTJ = AEQbTJ(taskDescription);
                PlanetShareView.OKIMShareParams oKIMShareParams = (PlanetShareView.OKIMShareParams) CollectionsKt___CollectionsKt.AkhnZx(list2, i);
                ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
                Intrinsics.copydefault(bitmapAEQbTJ);
                ImageShareParams imageShareParamsCreate$default = ImageShareParams.ActionBar.create$default(actionBar, abstractActivityC33041mov, bitmapAEQbTJ, (ImageSource) null, (Function1) null, 12, (java.lang.Object) null);
                imageShareParamsCreate$default.setShareFrom("planet_trade");
                imageShareParamsCreate$default.setBody(str);
                android.os.Bundle extras = imageShareParamsCreate$default.getExtras();
                extras.putBoolean("isEnableIMShare", true);
                extras.putParcelable("imMessageShare", iMMessageShareModel.copy((1783 & 1) != 0 ? iMMessageShareModel.title : null, (1783 & 2) != 0 ? iMMessageShareModel.content : null, (1783 & 4) != 0 ? iMMessageShareModel.messagePreview : null, (1783 & 8) != 0 ? iMMessageShareModel.image : fileAEQbTJ != null ? fileAEQbTJ.getAbsolutePath() : null, (1783 & 16) != 0 ? iMMessageShareModel.imageBase64 : null, (1783 & 32) != 0 ? iMMessageShareModel.deeplink : null, (1783 & 64) != 0 ? iMMessageShareModel.shortLink : null, (1783 & 128) != 0 ? iMMessageShareModel.tagline : null, (1783 & 256) != 0 ? iMMessageShareModel.ctaType : oKIMShareParams != null ? oKIMShareParams.copydefault() : null, (1783 & 512) != 0 ? iMMessageShareModel.extra : null, (1783 & 1024) != 0 ? iMMessageShareModel.bizName : null));
                ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(ShareConfig.Companion, imageShareParamsCreate$default, null, 2, null);
                ISharePreviewConfig previewConfig = shareConfigCreate$default.getPreviewConfig();
                Intrinsics.copydefault(previewConfig, "");
                ImageDefaultPreviewConfig imageDefaultPreviewConfig = (ImageDefaultPreviewConfig) previewConfig;
                imageDefaultPreviewConfig.setImagePreviewType(ImagePreviewType.CENTER_INSIDE);
                imageDefaultPreviewConfig.setPreviewBottomTips("");
                int iDp2px$default = C55298xhM.dp2px$default(24.0f, null, 1, null);
                imageDefaultPreviewConfig.setImagePreviewPadding(new android.graphics.Rect(iDp2px$default, 0, iDp2px$default, 0));
                arrayList.add(shareConfigCreate$default);
                i++;
            }
            interfaceC48893ueK.OLrzqt(abstractActivityC33041mov, MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, arrayList, false, 1.0f, false, null, null, 58, null));
        } catch (java.lang.Exception e) {
            pUU.copydefault("SocialTradeShareManager2", "error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public final java.io.File AEQbTJ(PlanetShareView.TaskDescription taskDescription) {
        android.view.View viewEZpvd = taskDescription.EZpvd();
        tLJ tlj = (tLJ) viewEZpvd.findViewById(taskDescription.OLrzqt());
        if (tlj != null) {
            tlj.setVisibility(8);
        }
        AEQbTJ(viewEZpvd, false);
        android.graphics.Bitmap bitmapAEQbTJ = C33570myu.AEQbTJ(viewEZpvd, true);
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        Intrinsics.copydefault(bitmapAEQbTJ);
        java.io.File fileAEQbTJ = stateListAnimator.AEQbTJ(bitmapAEQbTJ);
        tLJ tlj2 = (tLJ) taskDescription.EZpvd().findViewById(taskDescription.OLrzqt());
        if (tlj2 != null) {
            tlj2.setVisibility(0);
        }
        return fileAEQbTJ;
    }

    public final void AEQbTJ(android.view.View view, boolean z) {
        int iOLrzqt;
        int iOLrzqt2 = C33070mpX.OLrzqt(C47501trL.StateListAnimator.gEmmrt);
        if (z) {
            iOLrzqt = C33070mpX.OLrzqt(C47501trL.StateListAnimator.valueOf);
        } else {
            iOLrzqt = C33070mpX.OLrzqt(C47501trL.StateListAnimator.AhwBna);
        }
        view.setLayoutDirection(3);
        view.measure(View.MeasureSpec.makeMeasureSpec(iOLrzqt2, 1073741824), View.MeasureSpec.makeMeasureSpec(iOLrzqt, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final CompletableDeferred<java.lang.String> copydefault(InterfaceC48893ueK interfaceC48893ueK, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.lang.String str2) {
        final CompletableDeferred<java.lang.String> completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(interfaceC48893ueK.AEQbTJ(AEQbTJ(str), new C48891ueI("planet_trade", str2, true, RedirectBehavior.DEFAULT_ALLOW_DEEPLINK, null, 16, null)), abstractActivityC33041mov);
        final Function1 function1 = new Function1() { // from class: o.tLM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tLN.OLrzqt(completableDeferredCompletableDeferred$default, (C48887ueE) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.tLP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                tLN.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.tLQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tLN.KWHzl(completableDeferredCompletableDeferred$default, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.tLU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                tLN.AEQbTJ(function12, obj);
            }
        });
        return completableDeferredCompletableDeferred$default;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(CompletableDeferred completableDeferred, C48887ueE c48887ueE) {
        completableDeferred.complete(c48887ueE.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(CompletableDeferred completableDeferred, java.lang.Throwable th) {
        completableDeferred.complete(null);
        pUU.copydefault(KWHzl, "short link error: " + (th != null ? th.getMessage() : null));
        return Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new PlanetShareManager$displayLoading$2(abstractActivityC33041mov, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (new Regex("^(https?|ftp)://[^\\s/$.?#].\\S*$").matches(str)) {
            return str;
        }
        return DefaultWebClient.HTTPS_SCHEME + str;
    }
}
