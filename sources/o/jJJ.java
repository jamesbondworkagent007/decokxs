package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.assets.api.model.ValuationCurrency;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class jJJ extends AbstractC40510qYn<C25908jKv, C42870rea> {
    public final int[] AEQbTJ;
    public final StateFlow<ValuationCurrency> KWHzl;

    public jJJ(@NotNull StateFlow<ValuationCurrency> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "");
        this.KWHzl = stateFlow;
        this.AEQbTJ = new int[]{C33070mpX.copydefault(C52761wXj.Activity.RAQtXZ), C33070mpX.copydefault(C52761wXj.Activity.jh), C33070mpX.copydefault(C52761wXj.Activity.ibnZAm), C33070mpX.copydefault(C52761wXj.Activity.gdmIOq), C33070mpX.copydefault(C52761wXj.Activity.OqCbbx), C33070mpX.copydefault(C52761wXj.Activity.zuBGHE)};
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42870rea AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42870rea c42870reaEZpvd = C42870rea.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42870reaEZpvd, "");
        return c42870reaEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42870rea c42870rea, int i, @NotNull C25908jKv c25908jKv) {
        Intrinsics.checkNotNullParameter(c42870rea, "");
        Intrinsics.checkNotNullParameter(c25908jKv, "");
        android.view.View view = c42870rea.OLrzqt;
        int[] iArr = this.AEQbTJ;
        view.setBackgroundColor(iArr[i % iArr.length]);
        c42870rea.KWHzl.setText(c25908jKv.AEQbTJ());
        c42870rea.AEQbTJ.setText(pTB.formatICUPercent$default(java.lang.Float.valueOf(c25908jKv.KWHzl()), null, null, null, java.lang.Double.valueOf(100.0d), null, 23, null));
        ValuationCurrency value = this.KWHzl.getValue();
        c42870rea.EZpvd.setText(C27977kKi.OLrzqt(C33129mqd.gEmmrt(java.lang.Double.valueOf(c25908jKv.EZpvd())), value.getUnit(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 2) != 0 ? "" : value.getSymbol(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 4) != 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 8) == 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 32) == 0 ? null : "", (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 64) != 0, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 128) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0068: INVOKE 
              (wrap:androidx.appcompat.widget.AppCompatTextView:0x0042: IGET (r13v0 'c42870rea' o.rea) A[WRAPPED] (LINE:51) o.rea.EZpvd androidx.appcompat.widget.AppCompatTextView)
              (wrap:java.lang.String:0x0064: INVOKE 
              (wrap:java.lang.String:0x004c: INVOKE 
              (wrap:java.lang.Double:0x0048: INVOKE (wrap:double:0x0044: INVOKE (r15v0 'c25908jKv' o.jKv) VIRTUAL call: o.jKv.EZpvd():double A[MD:():double (m), WRAPPED]) STATIC call: java.lang.Double.valueOf(double):java.lang.Double A[MD:(double):java.lang.Double (c), WRAPPED])
             STATIC call: o.mqd.gEmmrt(java.lang.Object):java.lang.String A[MD:(java.lang.Object):java.lang.String (m), WRAPPED])
              (wrap:java.lang.String:0x0050: INVOKE (r14v7 'value' com.okinc.assets.api.model.ValuationCurrency) VIRTUAL call: com.okinc.assets.api.model.ValuationCurrency.getUnit():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:52))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (wrap:java.lang.String:0x0054: INVOKE (r14v7 'value' com.okinc.assets.api.model.ValuationCurrency) VIRTUAL call: com.okinc.assets.api.model.ValuationCurrency.getSymbol():java.lang.String A[MD:():java.lang.String (m), WRAPPED]))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (4 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (8 int) A[WRAPPED]) == (0 int)) ? false : false)
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (null java.lang.String))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (32 int) A[WRAPPED]) == (0 int)) ? (null java.lang.String) : (""))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (64 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x002d: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:34) call: o.kKj.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0039: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:35) call: o.kKn.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function1:0x005e: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: o.jJP.<init>():void type: CONSTRUCTOR))
             STATIC call: o.kKi.OLrzqt(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):java.lang.String A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function2<? super java.math.BigDecimal, ? super o.pTy, java.lang.String>, kotlin.jvm.functions.Function1<? super java.lang.Integer, o.pTy>):java.lang.String (m), WRAPPED] (LINE:26))
             VIRTUAL call: android.widget.TextView.setText(java.lang.CharSequence):void A[MD:(java.lang.CharSequence):void (c)] (LINE:51) in method: o.jJJ.KWHzl(o.rea, int, o.jKv):void, file: classes23.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            this = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            android.view.View r0 = r13.OLrzqt
            int[] r1 = r12.AEQbTJ
            int r2 = r1.length
            int r14 = r14 % r2
            r14 = r1[r14]
            r0.setBackgroundColor(r14)
            androidx.appcompat.widget.AppCompatTextView r14 = r13.KWHzl
            java.lang.String r0 = r15.AEQbTJ()
            r14.setText(r0)
            androidx.appcompat.widget.AppCompatTextView r14 = r13.AEQbTJ
            float r0 = r15.KWHzl()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r6 = 0
            r7 = 23
            r8 = 0
            java.lang.String r0 = o.pTB.formatICUPercent$default(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.setText(r0)
            kotlinx.coroutines.flow.StateFlow<com.okinc.assets.api.model.ValuationCurrency> r14 = r12.KWHzl
            java.lang.Object r14 = r14.getValue()
            com.okinc.assets.api.model.ValuationCurrency r14 = (com.okinc.assets.api.model.ValuationCurrency) r14
            androidx.appcompat.widget.AppCompatTextView r13 = r13.EZpvd
            double r0 = r15.EZpvd()
            java.lang.Double r15 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = o.C33129mqd.gEmmrt(r15)
            java.lang.String r1 = r14.getUnit()
            java.lang.String r2 = r14.getSymbol()
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            o.jJP r9 = new o.jJP
            r9.<init>()
            r10 = 252(0xfc, float:3.53E-43)
            r11 = 0
            java.lang.String r14 = o.C27977kKi.formatValue$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.setText(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jJJ.AEQbTJ(o.rea, int, o.jKv):void");
    }

    public static final C38307pTy KWHzl(int i) {
        return C38307pTy.Companion.AEQbTJ(i);
    }
}
