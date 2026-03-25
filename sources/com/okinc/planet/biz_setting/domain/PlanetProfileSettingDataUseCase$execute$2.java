package com.okinc.planet.biz_setting.domain;

import com.okinc.planet.biz_setting.data.CurveResetInfo;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.manager.OrbitStatus;
import com.okinc.social_trade_api.data.AffiliatePartnerBeanForPlanet;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C46126tIu;
import o.C46131tIz;
import o.C46219tMf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.tIA;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetProfileSettingDataUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C46126tIu>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    final /* synthetic */ tIA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetProfileSettingDataUseCase$execute$2(tIA tia, Continuation<? super PlanetProfileSettingDataUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = tia;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetProfileSettingDataUseCase$execute$2 planetProfileSettingDataUseCase$execute$2 = new PlanetProfileSettingDataUseCase$execute$2(this.this$0, continuation);
        planetProfileSettingDataUseCase$execute$2.L$0 = obj;
        return planetProfileSettingDataUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C46126tIu> continuation) {
        return ((PlanetProfileSettingDataUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwait;
        CoroutineScope coroutineScope;
        Deferred deferred;
        OrbitStatus orbitStatus;
        Deferred deferredAsync$default;
        Deferred deferred2;
        Deferred deferredAsync$default2;
        String strORxRYg;
        boolean zRcXXUw;
        Object objAwait2;
        int i;
        Deferred deferred3;
        C46131tIz c46131tIz;
        OrbitStatus orbitStatus2;
        PlanetBasicUserInfoResp planetBasicUserInfoResp;
        int i2;
        String str;
        Deferred deferred4;
        C46131tIz c46131tIz2;
        PlanetBasicUserInfoResp planetBasicUserInfoResp2;
        boolean z;
        Object objAwait3;
        PlanetBasicUserInfoResp planetBasicUserInfoResp3;
        AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet;
        C46131tIz c46131tIz3;
        OrbitStatus orbitStatus3;
        boolean z2;
        CurveResetInfo curveResetInfo;
        OrbitStatus orbitStatus4;
        PlanetBasicUserInfoResp planetBasicUserInfoResp4;
        String str2;
        AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet2;
        C46131tIz c46131tIz4;
        Object objAwait4;
        boolean z3;
        int i3;
        PlanetBasicUserInfoResp planetBasicUserInfoResp5;
        String str3;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = this.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new PlanetProfileSettingDataUseCase$execute$2$basicInfo$1(this.this$0, null), 3, null);
            this.L$0 = coroutineScope2;
            this.L$1 = deferredAsync$default3;
            this.label = 1;
            objAwait = deferredAsync$default3.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope2;
            deferred = deferredAsync$default3;
        } else if (i4 == 1) {
            deferred = (Deferred) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z3 = this.Z$0;
                    i3 = this.I$0;
                    AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet3 = (AffiliatePartnerBeanForPlanet) this.L$4;
                    planetBasicUserInfoResp5 = (PlanetBasicUserInfoResp) this.L$3;
                    c46131tIz3 = (C46131tIz) this.L$2;
                    str3 = (String) this.L$1;
                    orbitStatus3 = (OrbitStatus) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    affiliatePartnerBeanForPlanet = affiliatePartnerBeanForPlanet3;
                    objAwait4 = obj;
                    z2 = z3;
                    affiliatePartnerBeanForPlanet2 = affiliatePartnerBeanForPlanet;
                    curveResetInfo = (CurveResetInfo) objAwait4;
                    planetBasicUserInfoResp4 = planetBasicUserInfoResp5;
                    c46131tIz4 = c46131tIz3;
                    str2 = str3;
                    orbitStatus4 = orbitStatus3;
                    i2 = i3;
                    return c46131tIz4.copydefault(planetBasicUserInfoResp4, affiliatePartnerBeanForPlanet2, curveResetInfo, orbitStatus4, i2 == 0, str2, z2);
                }
                z = this.Z$0;
                i2 = this.I$0;
                planetBasicUserInfoResp3 = (PlanetBasicUserInfoResp) this.L$6;
                c46131tIz = (C46131tIz) this.L$5;
                planetBasicUserInfoResp2 = (PlanetBasicUserInfoResp) this.L$4;
                c46131tIz2 = (C46131tIz) this.L$3;
                str = (String) this.L$2;
                deferred4 = (Deferred) this.L$1;
                orbitStatus2 = (OrbitStatus) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objAwait3 = obj;
                    Object objM7386unboximpl = ((Result) objAwait3).m7386unboximpl();
                    C56391yDq.AEQbTJ(objM7386unboximpl);
                    affiliatePartnerBeanForPlanet = (AffiliatePartnerBeanForPlanet) objM7386unboximpl;
                    zRcXXUw = z;
                    planetBasicUserInfoResp = planetBasicUserInfoResp3;
                    deferredAsync$default2 = deferred4;
                    i = i2;
                    strORxRYg = str;
                    i2 = i;
                    c46131tIz3 = c46131tIz;
                    str = strORxRYg;
                    orbitStatus3 = orbitStatus2;
                    deferred4 = deferredAsync$default2;
                    boolean z4 = zRcXXUw;
                    planetBasicUserInfoResp2 = planetBasicUserInfoResp;
                    z = z4;
                } catch (Exception unused) {
                    affiliatePartnerBeanForPlanet = null;
                    c46131tIz3 = c46131tIz2;
                    orbitStatus3 = orbitStatus2;
                }
                if (deferred4 == null) {
                    z2 = z;
                    curveResetInfo = null;
                    orbitStatus4 = orbitStatus3;
                    planetBasicUserInfoResp4 = planetBasicUserInfoResp2;
                    str2 = str;
                    affiliatePartnerBeanForPlanet2 = affiliatePartnerBeanForPlanet;
                    c46131tIz4 = c46131tIz3;
                    return c46131tIz4.copydefault(planetBasicUserInfoResp4, affiliatePartnerBeanForPlanet2, curveResetInfo, orbitStatus4, i2 == 0, str2, z2);
                }
                this.L$0 = orbitStatus3;
                this.L$1 = str;
                this.L$2 = c46131tIz3;
                this.L$3 = planetBasicUserInfoResp2;
                this.L$4 = affiliatePartnerBeanForPlanet;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i2;
                this.Z$0 = z;
                this.label = 4;
                objAwait4 = deferred4.await(this);
                if (objAwait4 == objCopydefault) {
                    return objCopydefault;
                }
                z3 = z;
                i3 = i2;
                planetBasicUserInfoResp5 = planetBasicUserInfoResp2;
                str3 = str;
                z2 = z3;
                affiliatePartnerBeanForPlanet2 = affiliatePartnerBeanForPlanet;
                curveResetInfo = (CurveResetInfo) objAwait4;
                planetBasicUserInfoResp4 = planetBasicUserInfoResp5;
                c46131tIz4 = c46131tIz3;
                str2 = str3;
                orbitStatus4 = orbitStatus3;
                i2 = i3;
                return c46131tIz4.copydefault(planetBasicUserInfoResp4, affiliatePartnerBeanForPlanet2, curveResetInfo, orbitStatus4, i2 == 0, str2, z2);
            }
            boolean z5 = this.Z$0;
            i = this.I$0;
            c46131tIz = (C46131tIz) this.L$4;
            String str4 = (String) this.L$3;
            deferredAsync$default2 = (Deferred) this.L$2;
            deferred3 = (Deferred) this.L$1;
            OrbitStatus orbitStatus5 = (OrbitStatus) this.L$0;
            C56391yDq.AEQbTJ(obj);
            orbitStatus2 = orbitStatus5;
            strORxRYg = str4;
            zRcXXUw = z5;
            objAwait2 = obj;
            planetBasicUserInfoResp = (PlanetBasicUserInfoResp) objAwait2;
            if (deferred3 == null) {
                try {
                    this.L$0 = orbitStatus2;
                    this.L$1 = deferredAsync$default2;
                    this.L$2 = strORxRYg;
                    this.L$3 = c46131tIz;
                    this.L$4 = planetBasicUserInfoResp;
                    this.L$5 = c46131tIz;
                    this.L$6 = planetBasicUserInfoResp;
                    this.I$0 = i;
                    this.Z$0 = zRcXXUw;
                    this.label = 3;
                    objAwait3 = deferred3.await(this);
                } catch (Exception unused2) {
                    i2 = i;
                    str = strORxRYg;
                    deferred4 = deferredAsync$default2;
                    c46131tIz2 = c46131tIz;
                    boolean z6 = zRcXXUw;
                    planetBasicUserInfoResp2 = planetBasicUserInfoResp;
                    z = z6;
                    affiliatePartnerBeanForPlanet = null;
                    c46131tIz3 = c46131tIz2;
                    orbitStatus3 = orbitStatus2;
                }
                if (objAwait3 == objCopydefault) {
                    return objCopydefault;
                }
                i2 = i;
                str = strORxRYg;
                planetBasicUserInfoResp3 = planetBasicUserInfoResp;
                deferred4 = deferredAsync$default2;
                c46131tIz2 = c46131tIz;
                z = zRcXXUw;
                planetBasicUserInfoResp2 = planetBasicUserInfoResp3;
                Object objM7386unboximpl2 = ((Result) objAwait3).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7386unboximpl2);
                affiliatePartnerBeanForPlanet = (AffiliatePartnerBeanForPlanet) objM7386unboximpl2;
                zRcXXUw = z;
                planetBasicUserInfoResp = planetBasicUserInfoResp3;
                deferredAsync$default2 = deferred4;
                i = i2;
                strORxRYg = str;
                i2 = i;
                c46131tIz3 = c46131tIz;
                str = strORxRYg;
                orbitStatus3 = orbitStatus2;
                deferred4 = deferredAsync$default2;
                boolean z42 = zRcXXUw;
                planetBasicUserInfoResp2 = planetBasicUserInfoResp;
                z = z42;
                if (deferred4 == null) {
                }
            } else {
                affiliatePartnerBeanForPlanet = null;
                i2 = i;
                c46131tIz3 = c46131tIz;
                str = strORxRYg;
                orbitStatus3 = orbitStatus2;
                deferred4 = deferredAsync$default2;
                boolean z422 = zRcXXUw;
                planetBasicUserInfoResp2 = planetBasicUserInfoResp;
                z = z422;
                if (deferred4 == null) {
                }
            }
        }
        PlanetBasicUserInfoResp planetBasicUserInfoResp6 = (PlanetBasicUserInfoResp) objAwait;
        OrbitStatus orbitStatusAEQbTJ = OrbitStatus.Companion.AEQbTJ(C56443yFo.AEQbTJ(planetBasicUserInfoResp6.uzCIH()));
        boolean zQbewEr = planetBasicUserInfoResp6.QbewEr();
        if (zQbewEr) {
            orbitStatus = orbitStatusAEQbTJ;
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new PlanetProfileSettingDataUseCase$execute$2$affiliatePartnerBean$1(null), 3, null);
        } else {
            orbitStatus = orbitStatusAEQbTJ;
            deferredAsync$default = null;
        }
        if (C46219tMf.Companion.copydefault().KWHzl() && zQbewEr) {
            CoroutineScope coroutineScope3 = coroutineScope;
            deferred2 = deferredAsync$default;
            deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new PlanetProfileSettingDataUseCase$execute$2$curveResetInfo$1(this.this$0, null), 3, null);
        } else {
            deferred2 = deferredAsync$default;
            deferredAsync$default2 = null;
        }
        int i5 = (!zQbewEr || planetBasicUserInfoResp6.AubY().length() <= 0) ? 0 : 1;
        if (i5 != 0) {
            strORxRYg = planetBasicUserInfoResp6.ORxRYg();
            if (StringsKt__StringsKt.fARcdN((CharSequence) strORxRYg)) {
                strORxRYg = null;
            }
            zRcXXUw = planetBasicUserInfoResp6.RcXXUw();
            C46131tIz c46131tIz5 = C46131tIz.EZpvd;
            this.L$0 = orbitStatus;
            this.L$1 = deferred2;
            this.L$2 = deferredAsync$default2;
            this.L$3 = strORxRYg;
            this.L$4 = c46131tIz5;
            this.I$0 = i5;
            this.Z$0 = zRcXXUw;
            this.label = 2;
            objAwait2 = deferred.await(this);
            if (objAwait2 == objCopydefault) {
                return objCopydefault;
            }
            i = i5;
            deferred3 = deferred2;
            c46131tIz = c46131tIz5;
            orbitStatus2 = orbitStatus;
            planetBasicUserInfoResp = (PlanetBasicUserInfoResp) objAwait2;
            if (deferred3 == null) {
            }
        }
        return c46131tIz4.copydefault(planetBasicUserInfoResp4, affiliatePartnerBeanForPlanet2, curveResetInfo, orbitStatus4, i2 == 0, str2, z2);
    }
}
