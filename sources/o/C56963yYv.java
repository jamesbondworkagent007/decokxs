package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import o.InterfaceC56959yYr;
import o.yXX;
import o.yXY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yYv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56963yYv implements InterfaceC56959yYr {
    public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "startFromName", "getStartFromName()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "debugMode", "getDebugMode()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "verbose", "getVerbose()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "unitReturnType", "getUnitReturnType()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), C56524yIo.EZpvd(new MutablePropertyReference1Impl(C56963yYv.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};
    public final yIP AYXKKw;
    public final yIP AhwBna = EZpvd(yXY.Activity.KWHzl);
    public final yIP AkhnZx;
    public final yIP AuCTel;
    public final yIP AuCTelauCTel;
    public final yIP AubY;
    public final yIP AwvSrB;
    public final yIP AxsJAY;
    public final yIP DTwDnp;
    public final yIP DbNXlk;
    public final yIP EZpvd;
    public final yIP KWHzl;
    public final yIP OLrzqt;
    public final yIP ORxRYg;
    public final yIP OcIXYQ;
    public final yIP QKVWgx;
    public final yIP QOLQEE;
    public final yIP QUSxYX;
    public final yIP QVAiDq;
    public final yIP QbewEr;
    public final yIP QfsBiF;
    public final yIP RJOkX;
    public final yIP RcXXUw;
    public final yIP UeEOUB;
    public final yIP aKErDB;
    public final yIP copydefault;
    public final yIP dNCPSb;
    public final yIP djBIcL;
    public final yIP djSkpj;
    public final yIP dvKsVJ;
    public final yIP ejfBZ;
    public final yIP fARcdN;
    public final yIP fFgQHt;
    public boolean fIwbmz;
    public final yIP fJNWhG;
    public final yIP fetchVPNInfo;
    public final yIP gEmmrt;
    public final yIP gHZMYf;
    public final yIP getFieldNames;
    public final yIP getNewProxyInstance;
    public final yIP hDKMBd;
    public final yIP isConnected;
    public final yIP iwGUEr;
    public final yIP sSMYrx;
    public final yIP uzCIH;
    public final yIP valueOf;
    public final yIP values;
    public final yIP wlaJM;
    public final yIP zLjUOn;
    public final yIP zsXlph;
    public final yIP zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ(InterfaceC56695yOx interfaceC56695yOx) {
        Intrinsics.checkNotNullParameter(interfaceC56695yOx, "");
        return "...";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AbstractC59233zdF KWHzl(AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return abstractC59233zdF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void dvKsVJ() {
        this.fIwbmz = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fZBcTu() {
        return this.fIwbmz;
    }

    public C56963yYv() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.UeEOUB = EZpvd(bool);
        this.djSkpj = EZpvd(bool);
        this.fARcdN = EZpvd(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        this.QVAiDq = EZpvd(bool2);
        this.ORxRYg = EZpvd(bool2);
        this.AYXKKw = EZpvd(bool2);
        this.djBIcL = EZpvd(bool2);
        this.dNCPSb = EZpvd(bool2);
        this.RJOkX = EZpvd(bool);
        this.aKErDB = EZpvd(bool2);
        this.fetchVPNInfo = EZpvd(bool2);
        this.AuCTel = EZpvd(bool2);
        this.sSMYrx = EZpvd(bool);
        this.AxsJAY = EZpvd(bool);
        this.wlaJM = EZpvd(bool2);
        this.DTwDnp = EZpvd(bool2);
        this.OLrzqt = EZpvd(bool2);
        this.QUSxYX = EZpvd(bool2);
        this.ejfBZ = EZpvd(bool2);
        this.zsXlph = EZpvd((java.lang.Object) null);
        this.dvKsVJ = EZpvd(bool2);
        this.fFgQHt = EZpvd(bool2);
        this.QfsBiF = EZpvd(C56960yYs.KWHzl);
        this.gEmmrt = EZpvd(C56961yYt.OLrzqt);
        this.QKVWgx = EZpvd(bool);
        this.iwGUEr = EZpvd(OverrideRenderingPolicy.RENDER_OPEN);
        this.RcXXUw = EZpvd(yXX.ActionBar.Application.AEQbTJ);
        this.QbewEr = EZpvd(RenderingFormat.PLAIN);
        this.hDKMBd = EZpvd(ParameterNameRenderingPolicy.ALL);
        this.zLjUOn = EZpvd(bool2);
        this.AubY = EZpvd(bool2);
        this.uzCIH = EZpvd(PropertyAccessorRenderingPolicy.DEBUG);
        this.gHZMYf = EZpvd(bool2);
        this.DbNXlk = EZpvd(bool2);
        this.values = EZpvd(yEE.copydefault());
        this.isConnected = EZpvd(C56967yYz.copydefault.KWHzl());
        this.EZpvd = EZpvd((java.lang.Object) null);
        this.copydefault = EZpvd(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.KWHzl = EZpvd(bool2);
        this.AwvSrB = EZpvd(bool);
        this.QOLQEE = EZpvd(bool);
        this.OcIXYQ = EZpvd(bool2);
        this.AuCTelauCTel = EZpvd(bool2);
        this.AkhnZx = EZpvd(bool);
        this.getNewProxyInstance = EZpvd(bool);
        this.zuBGHE = EZpvd(bool2);
        this.getFieldNames = EZpvd(bool2);
        this.valueOf = EZpvd(bool2);
        this.fJNWhG = EZpvd(bool);
    }

    public boolean AuCTel() {
        return InterfaceC56959yYr.Application.EZpvd(this);
    }

    public boolean fARcdN() {
        return InterfaceC56959yYr.Application.AEQbTJ(this);
    }

    public final C56963yYv KWHzl() {
        C56963yYv c56963yYv = new C56963yYv();
        java.util.Iterator itEZpvd = yHX.EZpvd(C56963yYv.class.getDeclaredFields());
        while (itEZpvd.hasNext()) {
            java.lang.reflect.Field field = (java.lang.reflect.Field) itEZpvd.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                java.lang.Object obj = field.get(this);
                yIL yil = obj instanceof yIL ? (yIL) obj : null;
                if (yil != null) {
                    java.lang.String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    C59449zhJ.startsWith$default(name, "is", false, 2, null);
                    InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C56963yYv.class);
                    java.lang.String name2 = field.getName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("get");
                    java.lang.String name3 = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "");
                    if (name3.length() > 0) {
                        char upperCase = java.lang.Character.toUpperCase(name3.charAt(0));
                        java.lang.String strSubstring = name3.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        name3 = upperCase + strSubstring;
                    }
                    sb.append(name3);
                    field.set(c56963yYv, c56963yYv.EZpvd(yil.getValue(this, new PropertyReference1Impl(interfaceC56551yJoAEQbTJ, name2, sb.toString()))));
                }
            }
        }
        return c56963yYv;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.yYv$ActionBar */
    public static final class ActionBar<T> extends yIL<T> {
        public final /* synthetic */ C56963yYv copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(java.lang.Object obj, C56963yYv c56963yYv) {
            super(obj);
            this.copydefault = c56963yYv;
        }

        @Override // o.yIL
        public boolean copydefault(yJA<?> yja, T t, T t2) {
            Intrinsics.checkNotNullParameter(yja, "");
            if (this.copydefault.fZBcTu()) {
                throw new java.lang.IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public final <T> yIP<C56963yYv, T> EZpvd(T t) {
        yIJ yij = yIJ.OLrzqt;
        return new ActionBar(t, this);
    }

    @Override // o.InterfaceC56959yYr
    public void EZpvd(@NotNull yXY yxy) {
        Intrinsics.checkNotNullParameter(yxy, "");
        this.AhwBna.KWHzl(this, AEQbTJ[0], yxy);
    }

    public yXY valueOf() {
        return (yXY) this.AhwBna.getValue(this, AEQbTJ[0]);
    }

    @Override // o.InterfaceC56959yYr
    public void AYXKKw(boolean z) {
        this.UeEOUB.KWHzl(this, AEQbTJ[1], java.lang.Boolean.valueOf(z));
    }

    public boolean dNCPSb() {
        return ((java.lang.Boolean) this.UeEOUB.getValue(this, AEQbTJ[1])).booleanValue();
    }

    public boolean RcXXUw() {
        return ((java.lang.Boolean) this.djSkpj.getValue(this, AEQbTJ[2])).booleanValue();
    }

    @Override // o.InterfaceC56959yYr
    public void OLrzqt(@NotNull java.util.Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.fARcdN.KWHzl(this, AEQbTJ[3], set);
    }

    public java.util.Set<DescriptorRendererModifier> ejfBZ() {
        return (java.util.Set) this.fARcdN.getValue(this, AEQbTJ[3]);
    }

    @Override // o.InterfaceC56959yYr
    public void EZpvd(boolean z) {
        this.QVAiDq.KWHzl(this, AEQbTJ[4], java.lang.Boolean.valueOf(z));
    }

    public boolean RJOkX() {
        return ((java.lang.Boolean) this.QVAiDq.getValue(this, AEQbTJ[4])).booleanValue();
    }

    public boolean ORxRYg() {
        return ((java.lang.Boolean) this.ORxRYg.getValue(this, AEQbTJ[5])).booleanValue();
    }

    @Override // o.InterfaceC56959yYr
    public void OLrzqt(boolean z) {
        this.AYXKKw.KWHzl(this, AEQbTJ[6], java.lang.Boolean.valueOf(z));
    }

    @Override // o.InterfaceC56959yYr
    public boolean djBIcL() {
        return ((java.lang.Boolean) this.AYXKKw.getValue(this, AEQbTJ[6])).booleanValue();
    }

    public boolean AhwBna() {
        return ((java.lang.Boolean) this.djBIcL.getValue(this, AEQbTJ[7])).booleanValue();
    }

    @Override // o.InterfaceC56959yYr
    public void copydefault(boolean z) {
        this.dNCPSb.KWHzl(this, AEQbTJ[8], java.lang.Boolean.valueOf(z));
    }

    public boolean djSkpj() {
        return ((java.lang.Boolean) this.dNCPSb.getValue(this, AEQbTJ[8])).booleanValue();
    }

    public boolean QbewEr() {
        return ((java.lang.Boolean) this.RJOkX.getValue(this, AEQbTJ[9])).booleanValue();
    }

    public boolean UeEOUB() {
        return ((java.lang.Boolean) this.aKErDB.getValue(this, AEQbTJ[10])).booleanValue();
    }

    @Override // o.InterfaceC56959yYr
    public boolean AkhnZx() {
        return ((java.lang.Boolean) this.fetchVPNInfo.getValue(this, AEQbTJ[11])).booleanValue();
    }

    public boolean getFieldNames() {
        return ((java.lang.Boolean) this.AuCTel.getValue(this, AEQbTJ[12])).booleanValue();
    }

    public boolean AxsJAY() {
        return ((java.lang.Boolean) this.sSMYrx.getValue(this, AEQbTJ[13])).booleanValue();
    }

    public boolean gHZMYf() {
        return ((java.lang.Boolean) this.AxsJAY.getValue(this, AEQbTJ[14])).booleanValue();
    }

    public boolean zuBGHE() {
        return ((java.lang.Boolean) this.wlaJM.getValue(this, AEQbTJ[15])).booleanValue();
    }

    public boolean OcIXYQ() {
        return ((java.lang.Boolean) this.DTwDnp.getValue(this, AEQbTJ[16])).booleanValue();
    }

    public boolean copydefault() {
        return ((java.lang.Boolean) this.OLrzqt.getValue(this, AEQbTJ[17])).booleanValue();
    }

    public boolean QUSxYX() {
        return ((java.lang.Boolean) this.QUSxYX.getValue(this, AEQbTJ[18])).booleanValue();
    }

    public boolean fIwbmz() {
        return ((java.lang.Boolean) this.ejfBZ.getValue(this, AEQbTJ[19])).booleanValue();
    }

    public Function1<AbstractC56975yZg<?>, java.lang.String> AubY() {
        return (Function1) this.zsXlph.getValue(this, AEQbTJ[20]);
    }

    @Override // o.InterfaceC56959yYr
    public void djBIcL(boolean z) {
        this.dvKsVJ.KWHzl(this, AEQbTJ[21], java.lang.Boolean.valueOf(z));
    }

    public boolean finit() {
        return ((java.lang.Boolean) this.dvKsVJ.getValue(this, AEQbTJ[21])).booleanValue();
    }

    @Override // o.InterfaceC56959yYr
    public void AhwBna(boolean z) {
        this.fFgQHt.KWHzl(this, AEQbTJ[22], java.lang.Boolean.valueOf(z));
    }

    public boolean dxcTrN() {
        return ((java.lang.Boolean) this.fFgQHt.getValue(this, AEQbTJ[22])).booleanValue();
    }

    public Function1<AbstractC59233zdF, AbstractC59233zdF> QfsBiF() {
        return (Function1) this.QfsBiF.getValue(this, AEQbTJ[23]);
    }

    public Function1<InterfaceC56695yOx, java.lang.String> gEmmrt() {
        return (Function1) this.gEmmrt.getValue(this, AEQbTJ[24]);
    }

    public boolean QKVWgx() {
        return ((java.lang.Boolean) this.QKVWgx.getValue(this, AEQbTJ[25])).booleanValue();
    }

    public OverrideRenderingPolicy iwGUEr() {
        return (OverrideRenderingPolicy) this.iwGUEr.getValue(this, AEQbTJ[26]);
    }

    public yXX.ActionBar aKErDB() {
        return (yXX.ActionBar) this.RcXXUw.getValue(this, AEQbTJ[27]);
    }

    @Override // o.InterfaceC56959yYr
    public void OLrzqt(@NotNull RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "");
        this.QbewEr.KWHzl(this, AEQbTJ[28], renderingFormat);
    }

    public RenderingFormat QVAiDq() {
        return (RenderingFormat) this.QbewEr.getValue(this, AEQbTJ[28]);
    }

    @Override // o.InterfaceC56959yYr
    public void copydefault(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "");
        this.hDKMBd.KWHzl(this, AEQbTJ[29], parameterNameRenderingPolicy);
    }

    public ParameterNameRenderingPolicy hDKMBd() {
        return (ParameterNameRenderingPolicy) this.hDKMBd.getValue(this, AEQbTJ[29]);
    }

    public boolean AuCTelauCTel() {
        return ((java.lang.Boolean) this.zLjUOn.getValue(this, AEQbTJ[30])).booleanValue();
    }

    @Override // o.InterfaceC56959yYr
    public void KWHzl(boolean z) {
        this.zLjUOn.KWHzl(this, AEQbTJ[30], java.lang.Boolean.valueOf(z));
    }

    @Override // o.InterfaceC56959yYr
    public void AEQbTJ(boolean z) {
        this.AubY.KWHzl(this, AEQbTJ[31], java.lang.Boolean.valueOf(z));
    }

    public boolean zLjUOn() {
        return ((java.lang.Boolean) this.AubY.getValue(this, AEQbTJ[31])).booleanValue();
    }

    public PropertyAccessorRenderingPolicy zsXlph() {
        return (PropertyAccessorRenderingPolicy) this.uzCIH.getValue(this, AEQbTJ[32]);
    }

    public boolean AwvSrB() {
        return ((java.lang.Boolean) this.gHZMYf.getValue(this, AEQbTJ[33])).booleanValue();
    }

    public boolean fetchVPNInfo() {
        return ((java.lang.Boolean) this.DbNXlk.getValue(this, AEQbTJ[34])).booleanValue();
    }

    public java.util.Set<C56933yXs> values() {
        return (java.util.Set) this.values.getValue(this, AEQbTJ[35]);
    }

    @Override // o.InterfaceC56959yYr
    public java.util.Set<C56933yXs> DbNXlk() {
        return (java.util.Set) this.isConnected.getValue(this, AEQbTJ[36]);
    }

    @Override // o.InterfaceC56959yYr
    public void EZpvd(@NotNull java.util.Set<C56933yXs> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.isConnected.KWHzl(this, AEQbTJ[36], set);
    }

    public Function1<yOJ, java.lang.Boolean> OLrzqt() {
        return (Function1) this.EZpvd.getValue(this, AEQbTJ[37]);
    }

    @Override // o.InterfaceC56959yYr
    public AnnotationArgumentsRenderingPolicy EZpvd() {
        return (AnnotationArgumentsRenderingPolicy) this.copydefault.getValue(this, AEQbTJ[38]);
    }

    @Override // o.InterfaceC56959yYr
    public void OLrzqt(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "");
        this.copydefault.KWHzl(this, AEQbTJ[38], annotationArgumentsRenderingPolicy);
    }

    public boolean AEQbTJ() {
        return ((java.lang.Boolean) this.KWHzl.getValue(this, AEQbTJ[39])).booleanValue();
    }

    public boolean sSMYrx() {
        return ((java.lang.Boolean) this.AwvSrB.getValue(this, AEQbTJ[40])).booleanValue();
    }

    public boolean DTwDnp() {
        return ((java.lang.Boolean) this.QOLQEE.getValue(this, AEQbTJ[41])).booleanValue();
    }

    public boolean QOLQEE() {
        return ((java.lang.Boolean) this.OcIXYQ.getValue(this, AEQbTJ[42])).booleanValue();
    }

    public boolean wlaJM() {
        return ((java.lang.Boolean) this.AuCTelauCTel.getValue(this, AEQbTJ[43])).booleanValue();
    }

    public boolean isConnected() {
        return ((java.lang.Boolean) this.AkhnZx.getValue(this, AEQbTJ[44])).booleanValue();
    }

    public boolean getNewProxyInstance() {
        return ((java.lang.Boolean) this.getNewProxyInstance.getValue(this, AEQbTJ[45])).booleanValue();
    }

    public boolean uzCIH() {
        return ((java.lang.Boolean) this.getFieldNames.getValue(this, AEQbTJ[47])).booleanValue();
    }

    public boolean AYXKKw() {
        return ((java.lang.Boolean) this.valueOf.getValue(this, AEQbTJ[48])).booleanValue();
    }

    public boolean fJNWhG() {
        return ((java.lang.Boolean) this.fJNWhG.getValue(this, AEQbTJ[49])).booleanValue();
    }
}
