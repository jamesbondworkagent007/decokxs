package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.github.mikephil.charting.data.Entry;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.business.market.features.analysis.futures.sub.overview.data.model.CumulativePnlPo;
import com.okinc.business.market.features.analysis.futures.sub.overview.domain.usecase.GetOverviewUseCase$onExecute$1;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.market.common.bean.PayloadPeriod;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jKM extends AbstractC49400uno<kotlin.Pair<? extends AnalysisOverviewPeriod, ? extends java.lang.String>, C25915jLb> {
    public final jKP AEQbTJ;
    public final InterfaceC8218ayb KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((kotlin.Pair<? extends AnalysisOverviewPeriod, java.lang.String>) obj, (Continuation<? super C25915jLb>) continuation);
    }

    @yCM
    public jKM(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC8218ayb interfaceC8218ayb, @NotNull jKP jkp) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC8218ayb, "");
        Intrinsics.checkNotNullParameter(jkp, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = interfaceC8218ayb;
        this.AEQbTJ = jkp;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<? extends AnalysisOverviewPeriod, java.lang.String> pair, @NotNull Continuation<? super C25915jLb> continuation) throws java.lang.Throwable {
        GetOverviewUseCase$onExecute$1 getOverviewUseCase$onExecute$1;
        AnalysisOverviewPeriod analysisOverviewPeriod;
        jKM jkm;
        if (continuation instanceof GetOverviewUseCase$onExecute$1) {
            getOverviewUseCase$onExecute$1 = (GetOverviewUseCase$onExecute$1) continuation;
            int i = getOverviewUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOverviewUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getOverviewUseCase$onExecute$1 = new GetOverviewUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getOverviewUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getOverviewUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AnalysisOverviewPeriod analysisOverviewPeriodComponent1 = pair.component1();
            java.lang.String strComponent2 = pair.component2();
            jKP jkp = this.AEQbTJ;
            PayloadPeriod payload = analysisOverviewPeriodComponent1.getPayload();
            java.lang.String unit = this.KWHzl.OLrzqt().getValue().getUnit();
            getOverviewUseCase$onExecute$1.L$0 = analysisOverviewPeriodComponent1;
            getOverviewUseCase$onExecute$1.L$1 = this;
            getOverviewUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = jkp.EZpvd(payload, unit, strComponent2, getOverviewUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            analysisOverviewPeriod = analysisOverviewPeriodComponent1;
            obj = objEZpvd;
            jkm = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jkm = (jKM) getOverviewUseCase$onExecute$1.L$1;
            analysisOverviewPeriod = (AnalysisOverviewPeriod) getOverviewUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return jkm.EZpvd((jKO) obj, analysisOverviewPeriod);
    }

    public final C25915jLb EZpvd(jKO jko, AnalysisOverviewPeriod analysisOverviewPeriod) {
        if (jko == null) {
            return null;
        }
        ValuationCurrency value = this.KWHzl.OLrzqt().getValue();
        java.util.List<Entry> listKWHzl = KWHzl(jko.valueOf());
        java.lang.String strOLrzqt = C27977kKi.OLrzqt(jko.EZpvd(), value.getUnit(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 2) != 0 ? "" : value.getSymbol(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 4) != 0 ? false : true, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 8) == 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 32) == 0 ? null : "", (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 64) != 0, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 128) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0039: INVOKE (r5v0 'strOLrzqt' java.lang.String) = 
              (wrap:java.lang.String:0x001a: INVOKE (r48v0 'jko' o.jKO) VIRTUAL call: o.jKO.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:57))
              (wrap:java.lang.String:0x001e: INVOKE (r2v3 'value' com.okinc.assets.api.model.ValuationCurrency) VIRTUAL call: com.okinc.assets.api.model.ValuationCurrency.getUnit():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:58))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (wrap:java.lang.String:0x0022: INVOKE (r2v3 'value' com.okinc.assets.api.model.ValuationCurrency) VIRTUAL call: com.okinc.assets.api.model.ValuationCurrency.getSymbol():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:59)))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (4 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (8 int) A[WRAPPED]) == (0 int)) ? false : false)
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (null java.lang.String))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (32 int) A[WRAPPED]) == (0 int)) ? (null java.lang.String) : (""))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (64 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x002d: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:34) call: o.kKj.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function2:0x0030: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:57) call: o.jKN.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0039: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:35) call: o.kKn.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
             STATIC call: o.kKi.OLrzqt(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):java.lang.String A[DECLARE_VAR, MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function2<? super java.math.BigDecimal, ? super o.pTy, java.lang.String>, kotlin.jvm.functions.Function1<? super java.lang.Integer, o.pTy>):java.lang.String (m)] (LINE:26) in method: o.jKM.EZpvd(o.jKO, com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod):o.jLb, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.kKj, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 19 more
            */
        /*
            this = this;
            r0 = r47
            r1 = 0
            if (r48 != 0) goto L6
            return r1
        L6:
            o.ayb r2 = r0.KWHzl
            kotlinx.coroutines.flow.StateFlow r2 = r2.OLrzqt()
            java.lang.Object r2 = r2.getValue()
            com.okinc.assets.api.model.ValuationCurrency r2 = (com.okinc.assets.api.model.ValuationCurrency) r2
            java.util.List r3 = r48.valueOf()
            java.util.List r10 = r0.KWHzl(r3)
            java.lang.String r11 = r48.EZpvd()
            java.lang.String r12 = r2.getUnit()
            java.lang.String r13 = r2.getSymbol()
            r14 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            o.jKN r19 = new o.jKN
            r19.<init>()
            r20 = 0
            r21 = 376(0x178, float:5.27E-43)
            r22 = 0
            java.lang.String r5 = o.C27977kKi.formatValue$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.okinc.market.ext.UpDownColor$StateListAnimator r3 = com.okinc.market.ext.UpDownColor.Companion
            java.lang.String r4 = r48.EZpvd()
            com.okinc.market.ext.UpDownColor r6 = r3.AEQbTJ(r4)
            java.lang.String r7 = r2.getUnit()
            java.lang.String r11 = r48.gEmmrt()
            java.lang.String r12 = r2.getUnit()
            java.lang.String r13 = r2.getSymbol()
            o.jKU r19 = new o.jKU
            r19.<init>()
            java.lang.String r8 = o.C27977kKi.formatValue$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r4 = r48.gEmmrt()
            com.okinc.market.ext.UpDownColor r9 = r3.AEQbTJ(r4)
            java.lang.String r4 = r48.ejfBZ()
            java.math.BigDecimal r4 = o.C33129mqd.EZpvd(r4)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r12 = 100
            r11.<init>(r12)
            java.math.BigDecimal r13 = r4.multiply(r11)
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r4)
            r14 = 0
            r15 = 0
            r18 = 0
            r19 = 31
            java.lang.String r11 = o.pTB.formatICUPercent$default(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r12 = r48.AkhnZx()
            java.lang.String r4 = r48.DbNXlk()
            boolean r13 = o.C33129mqd.OLrzqt(r4)
            if (r13 == 0) goto L99
            goto L9a
        L99:
            r4 = r1
        L9a:
            java.lang.String r13 = "--"
            if (r4 != 0) goto La0
            r14 = r13
            goto La1
        La0:
            r14 = r4
        La1:
            java.lang.String r15 = r48.OLrzqt()
            java.lang.String r16 = r2.getUnit()
            java.lang.String r17 = r2.getSymbol()
            r18 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 504(0x1f8, float:7.06E-43)
            r26 = 0
            java.lang.String r15 = o.C27977kKi.formatValue$default(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r4 = r48.OLrzqt()
            com.okinc.market.ext.UpDownColor r16 = r3.AEQbTJ(r4)
            java.lang.String r4 = r48.isConnected()
            boolean r17 = o.C33129mqd.OLrzqt(r4)
            if (r17 == 0) goto Ld6
            r1 = r4
        Ld6:
            if (r1 != 0) goto Ld9
            r1 = r13
        Ld9:
            java.lang.String r4 = r48.isConnected()
            r34 = r14
            double r13 = o.C33129mqd.AEQbTJ(r4)
            java.lang.String r17 = r0.OLrzqt(r13)
            java.lang.String r4 = r48.AEQbTJ()
            java.lang.String r18 = r0.copydefault(r4)
            java.lang.String r19 = r48.fJNWhG()
            java.lang.String r20 = r2.getUnit()
            java.lang.String r21 = r2.getSymbol()
            r22 = 1
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 504(0x1f8, float:7.06E-43)
            r30 = 0
            java.lang.String r20 = o.C27977kKi.formatValue$default(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r4 = r48.fJNWhG()
            com.okinc.market.ext.UpDownColor r21 = r3.AEQbTJ(r4)
            java.lang.String r4 = r48.fetchVPNInfo()
            java.lang.String r22 = r0.copydefault(r4)
            java.lang.String r23 = r48.fIwbmz()
            java.lang.String r35 = r48.copydefault()
            java.lang.String r36 = r2.getUnit()
            r37 = 0
            r38 = 1
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 506(0x1fa, float:7.09E-43)
            r46 = 0
            java.lang.String r24 = o.C27977kKi.formatValue$default(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            java.lang.String r4 = r48.copydefault()
            com.okinc.market.ext.UpDownColor r25 = r3.AEQbTJ(r4)
            java.lang.String r35 = r48.AYXKKw()
            java.lang.String r36 = r2.getUnit()
            java.lang.String r37 = r2.getSymbol()
            r45 = 504(0x1f8, float:7.06E-43)
            java.lang.String r26 = o.C27977kKi.formatValue$default(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            java.lang.String r4 = r48.AYXKKw()
            com.okinc.market.ext.UpDownColor r27 = r3.AEQbTJ(r4)
            java.lang.String r4 = r48.djBIcL()
            java.lang.String r28 = r0.copydefault(r4)
            java.lang.String r29 = r48.AhwBna()
            java.lang.String r35 = r48.KWHzl()
            java.lang.String r36 = r2.getUnit()
            r37 = 0
            r45 = 506(0x1fa, float:7.09E-43)
            java.lang.String r30 = o.C27977kKi.formatValue$default(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            java.lang.String r4 = r48.KWHzl()
            com.okinc.market.ext.UpDownColor r31 = r3.AEQbTJ(r4)
            java.lang.String r4 = r48.fJNWhG()
            java.lang.String r13 = r48.AYXKKw()
            int r19 = r0.copydefault(r4, r13)
            java.lang.String r35 = r48.values()
            java.lang.String r36 = r2.getUnit()
            java.lang.String r37 = r2.getSymbol()
            r45 = 504(0x1f8, float:7.06E-43)
            java.lang.String r32 = o.C27977kKi.formatValue$default(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            java.lang.String r2 = r48.values()
            com.okinc.market.ext.UpDownColor r33 = r3.AEQbTJ(r2)
            o.jLb r35 = new o.jLb
            r2 = r35
            r3 = r48
            r4 = r49
            r13 = r34
            r14 = r15
            r15 = r16
            r16 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r35
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jKM.EZpvd(o.jKO, com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod):o.jLb");
    }

    public static final java.lang.String OLrzqt(BigDecimal bigDecimal, C38307pTy c38307pTy) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        return pTB.formatICUNumber$default(bigDecimal, RoundingMode.HALF_UP, c38307pTy, null, null, 12, null);
    }

    public static final java.lang.String AEQbTJ(BigDecimal bigDecimal, C38307pTy c38307pTy) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        return pTB.formatICUNumber$default(bigDecimal, RoundingMode.HALF_UP, c38307pTy, null, null, 12, null);
    }

    public final int copydefault(java.lang.String str, java.lang.String str2) {
        BigDecimal bigDecimalAbs = C33129mqd.EZpvd(str).abs();
        bigDecimalAbs.setScale(4);
        BigDecimal bigDecimalAbs2 = C33129mqd.EZpvd(str2).abs();
        bigDecimalAbs2.setScale(4);
        Intrinsics.copydefault(bigDecimalAbs);
        Intrinsics.copydefault(bigDecimalAbs2);
        BigDecimal bigDecimalAdd = bigDecimalAbs.add(bigDecimalAbs2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
        if (!C33129mqd.AhwBna(bigDecimalAdd, BigDecimal.ZERO)) {
            return 0;
        }
        BigDecimal bigDecimalDivide = bigDecimalAbs.divide(bigDecimalAdd, 2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
        BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
        return bigDecimalMultiply.intValue();
    }

    public final java.lang.String OLrzqt(double d) {
        java.lang.Object objM7377constructorimpl;
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Double.valueOf(d), (java.lang.Object) 0)) {
            return "0:0";
        }
        try {
            Result.Application application = Result.Companion;
            int iPow = (int) java.lang.Math.pow(10.0d, ((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) java.lang.String.valueOf(d), new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null).get(1)).length());
            int i = (int) (d * ((double) iPow));
            int iCopydefault = copydefault(i, iPow);
            objM7377constructorimpl = Result.m7377constructorimpl((i / iCopydefault) + ":" + (iPow / iCopydefault));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? "0:0" : objM7377constructorimpl);
    }

    public static final int copydefault(int i, int i2) {
        return i2 == 0 ? i : copydefault(i2, i % i2);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        if (str.length() == 0) {
            return "--";
        }
        double dAEQbTJ = C33129mqd.AEQbTJ(str) / ((double) 1000);
        double d = RemoteMessageConst.DEFAULT_TTL;
        int iFloor = (int) java.lang.Math.floor(dAEQbTJ / d);
        double d2 = dAEQbTJ % d;
        double d3 = IMarketApiService.SIXTY_MINUTES;
        int iFloor2 = (int) java.lang.Math.floor(d2 / d3);
        double d4 = d2 % d3;
        double d5 = 60;
        int iFloor3 = (int) java.lang.Math.floor(d4 / d5);
        int i = (int) (d4 % d5);
        if (iFloor > 0) {
            return iFloor + "d " + iFloor2 + "h";
        }
        if (iFloor2 > 0) {
            return iFloor2 + "h " + iFloor3 + com.ibm.icu.text.DateFormat.MINUTE;
        }
        if (iFloor3 > 0) {
            return iFloor3 + "m " + i + com.ibm.icu.text.DateFormat.SECOND;
        }
        return i + com.ibm.icu.text.DateFormat.SECOND;
    }

    public final java.util.List<Entry> KWHzl(java.util.List<CumulativePnlPo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CumulativePnlPo cumulativePnlPoCopy$default : list) {
            if (cumulativePnlPoCopy$default.getTimeStep() == CumulativePnlPo.TimeStep.MONTH.getValue()) {
                cumulativePnlPoCopy$default = CumulativePnlPo.copy$default(cumulativePnlPoCopy$default, null, C41425qqa.KWHzl(cumulativePnlPoCopy$default.getDateTime()), null, 0, 13, null);
            }
            arrayList.add(new Entry(C33129mqd.EZpvd(java.lang.Long.valueOf(cumulativePnlPoCopy$default.getDateTime())).floatValue(), C33129mqd.EZpvd(cumulativePnlPoCopy$default.getCumulativePnl()).floatValue(), cumulativePnlPoCopy$default));
        }
        return arrayList;
    }
}
