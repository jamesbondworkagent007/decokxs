package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C56984yZp;
import o.yMB;
import o.yNO;
import o.yXX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yYh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56949yYh extends yXX implements InterfaceC56959yYr {
    public final C56963yYv fetchVPNInfo;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.yYh$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.CharSequence KWHzl(InterfaceC56695yOx interfaceC56695yOx) {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void AEQbTJ(boolean z) {
        this.fetchVPNInfo.AEQbTJ(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.fetchVPNInfo.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function1<InterfaceC56695yOx, java.lang.String> AYXKKw() {
        return this.fetchVPNInfo.gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void AYXKKw(boolean z) {
        this.fetchVPNInfo.AYXKKw(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void AhwBna(boolean z) {
        this.fetchVPNInfo.AhwBna(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.fetchVPNInfo.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public boolean AkhnZx() {
        return this.fetchVPNInfo.AkhnZx();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AuCTel() {
        return this.fetchVPNInfo.fARcdN();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AuCTelauCTel() {
        return this.fetchVPNInfo.AuCTelauCTel();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AubY() {
        return this.fetchVPNInfo.wlaJM();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AwvSrB() {
        return this.fetchVPNInfo.sSMYrx();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AxsJAY() {
        return this.fetchVPNInfo.gHZMYf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean DTwDnp() {
        return this.fetchVPNInfo.AxsJAY();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public java.util.Set<C56933yXs> DbNXlk() {
        return this.fetchVPNInfo.DbNXlk();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public AnnotationArgumentsRenderingPolicy EZpvd() {
        return this.fetchVPNInfo.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void EZpvd(@NotNull java.util.Set<C56933yXs> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.fetchVPNInfo.EZpvd(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void EZpvd(@NotNull yXY yxy) {
        Intrinsics.checkNotNullParameter(yxy, "");
        this.fetchVPNInfo.EZpvd(yxy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void EZpvd(boolean z) {
        this.fetchVPNInfo.EZpvd(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function1<yOJ, java.lang.Boolean> KWHzl() {
        return this.fetchVPNInfo.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void KWHzl(boolean z) {
        this.fetchVPNInfo.KWHzl(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void OLrzqt(@NotNull java.util.Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.fetchVPNInfo.OLrzqt(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void OLrzqt(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "");
        this.fetchVPNInfo.OLrzqt(annotationArgumentsRenderingPolicy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void OLrzqt(@NotNull RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "");
        this.fetchVPNInfo.OLrzqt(renderingFormat);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void OLrzqt(boolean z) {
        this.fetchVPNInfo.OLrzqt(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean ORxRYg() {
        return this.fetchVPNInfo.DTwDnp();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OcIXYQ() {
        return this.fetchVPNInfo.QKVWgx();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QKVWgx() {
        return this.fetchVPNInfo.OcIXYQ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QOLQEE() {
        return this.fetchVPNInfo.QOLQEE();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QUSxYX() {
        return this.fetchVPNInfo.RJOkX();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QVAiDq() {
        return this.fetchVPNInfo.ORxRYg();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QbewEr() {
        return this.fetchVPNInfo.QUSxYX();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function1<AbstractC59233zdF, AbstractC59233zdF> QfsBiF() {
        return this.fetchVPNInfo.QfsBiF();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RenderingFormat RJOkX() {
        return this.fetchVPNInfo.QVAiDq();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean RcXXUw() {
        return this.fetchVPNInfo.RcXXUw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean UeEOUB() {
        return this.fetchVPNInfo.QbewEr();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean aKErDB() {
        return this.fetchVPNInfo.djSkpj();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void copydefault(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "");
        this.fetchVPNInfo.copydefault(parameterNameRenderingPolicy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void copydefault(boolean z) {
        this.fetchVPNInfo.copydefault(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.fetchVPNInfo.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean dNCPSb() {
        return this.fetchVPNInfo.dNCPSb();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public void djBIcL(boolean z) {
        this.fetchVPNInfo.djBIcL(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56959yYr
    public boolean djBIcL() {
        return this.fetchVPNInfo.djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yXX.ActionBar djSkpj() {
        return this.fetchVPNInfo.aKErDB();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean dxcTrN() {
        return this.fetchVPNInfo.UeEOUB();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean ejfBZ() {
        return this.fetchVPNInfo.fJNWhG();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fARcdN() {
        return this.fetchVPNInfo.AuCTel();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fFgQHt() {
        return this.fetchVPNInfo.dxcTrN();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fIwbmz() {
        return this.fetchVPNInfo.isConnected();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fJNWhG() {
        return this.fetchVPNInfo.fIwbmz();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fZBcTu() {
        return this.fetchVPNInfo.finit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<C56933yXs> fetchVPNInfo() {
        return this.fetchVPNInfo.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yXY gEmmrt() {
        return this.fetchVPNInfo.valueOf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gHZMYf() {
        return this.fetchVPNInfo.zuBGHE();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ParameterNameRenderingPolicy getFieldNames() {
        return this.fetchVPNInfo.hDKMBd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getNewProxyInstance() {
        return this.fetchVPNInfo.getFieldNames();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OverrideRenderingPolicy hDKMBd() {
        return this.fetchVPNInfo.iwGUEr();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isConnected() {
        return this.fetchVPNInfo.fetchVPNInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<DescriptorRendererModifier> iwGUEr() {
        return this.fetchVPNInfo.ejfBZ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean sSMYrx() {
        return this.fetchVPNInfo.AwvSrB();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56963yYv uzCIH() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.fetchVPNInfo.AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean wlaJM() {
        return this.fetchVPNInfo.uzCIH();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PropertyAccessorRenderingPolicy zLjUOn() {
        return this.fetchVPNInfo.zsXlph();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean zsXlph() {
        return this.fetchVPNInfo.getNewProxyInstance();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean zuBGHE() {
        return this.fetchVPNInfo.zLjUOn();
    }

    public C56949yYh(@NotNull C56963yYv c56963yYv) {
        Intrinsics.checkNotNullParameter(c56963yYv, "");
        this.fetchVPNInfo = c56963yYv;
        c56963yYv.fZBcTu();
        this.values = C56392yDr.copydefault(new C56958yYq(this));
    }

    public final C56949yYh values() {
        return (C56949yYh) this.values.getValue();
    }

    public static final C56949yYh copydefault(C56949yYh c56949yYh) {
        yXX yxxOLrzqt = c56949yYh.OLrzqt(C56962yYu.OLrzqt);
        Intrinsics.copydefault(yxxOLrzqt, "");
        return (C56949yYh) yxxOLrzqt;
    }

    public static final Unit hDKMBd(InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        interfaceC56959yYr.EZpvd(yEJ.KWHzl(interfaceC56959yYr.DbNXlk(), yDY.gEmmrt(yMB.Application.zLjUOn, yMB.Application.getFieldNames)));
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        int i = TaskDescription.copydefault[RJOkX().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (valueOf()) {
            return str;
        }
        return "<b>" + str + "</b>";
    }

    public final java.lang.String copydefault(java.lang.String str) {
        int i = TaskDescription.copydefault[RJOkX().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return RJOkX().escape(str);
    }

    public final java.lang.String dvKsVJ() {
        return OLrzqt("<");
    }

    public final java.lang.String finit() {
        return OLrzqt(">");
    }

    public final java.lang.String OLrzqt() {
        int i = TaskDescription.copydefault[RJOkX().ordinal()];
        if (i == 1) {
            return OLrzqt("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = TaskDescription.copydefault[RJOkX().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + str + "</i>";
    }

    @Override // o.yXX
    public java.lang.String EZpvd(@NotNull C56935yXu c56935yXu, boolean z) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        java.lang.String strOLrzqt = OLrzqt(C56965yYx.EZpvd(c56935yXu));
        if (!valueOf() || RJOkX() != RenderingFormat.HTML || !z) {
            return strOLrzqt;
        }
        return "<b>" + strOLrzqt + "</b>";
    }

    public final void AEQbTJ(InterfaceC56665yNu interfaceC56665yNu, java.lang.StringBuilder sb, boolean z) {
        C56935yXu c56935yXuBR_ = interfaceC56665yNu.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        sb.append(EZpvd(c56935yXuBR_, z));
    }

    public final void EZpvd(InterfaceC56665yNu interfaceC56665yNu, java.lang.StringBuilder sb) {
        if (zuBGHE()) {
            if (QUSxYX()) {
                sb.append("companion object");
            }
            KWHzl(sb);
            InterfaceC56665yNu interfaceC56665yNuAuCTel = interfaceC56665yNu.AuCTel();
            if (interfaceC56665yNuAuCTel != null) {
                sb.append("of ");
                C56935yXu c56935yXuBR_ = interfaceC56665yNuAuCTel.bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                sb.append(EZpvd(c56935yXuBR_, false));
            }
        }
        if (aKErDB() || !Intrinsics.EZpvd(interfaceC56665yNu.bR_(), C56938yXx.EZpvd)) {
            if (!QUSxYX()) {
                KWHzl(sb);
            }
            C56935yXu c56935yXuBR_2 = interfaceC56665yNu.bR_();
            Intrinsics.checkNotNullExpressionValue(c56935yXuBR_2, "");
            sb.append(EZpvd(c56935yXuBR_2, true));
        }
    }

    @Override // o.yXX
    public java.lang.String copydefault(@NotNull C56930yXp c56930yXp) {
        Intrinsics.checkNotNullParameter(c56930yXp, "");
        return EZpvd(c56930yXp.gEmmrt());
    }

    public final java.lang.String EZpvd(java.util.List<C56935yXu> list) {
        return OLrzqt(C56965yYx.KWHzl(list));
    }

    public java.lang.String OLrzqt(@NotNull InterfaceC56663yNs interfaceC56663yNs) {
        Intrinsics.checkNotNullParameter(interfaceC56663yNs, "");
        if (C59370zfk.KWHzl(interfaceC56663yNs)) {
            return interfaceC56663yNs.fJNWhG().toString();
        }
        return gEmmrt().AEQbTJ(interfaceC56663yNs, this);
    }

    @Override // o.yXX
    public java.lang.String KWHzl(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        KWHzl(sb, QfsBiF().invoke(abstractC59233zdF));
        return sb.toString();
    }

    public final void KWHzl(java.lang.StringBuilder sb, AbstractC59233zdF abstractC59233zdF) {
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        C59186zcL c59186zcL = abstractC59331zeyAkhnZx instanceof C59186zcL ? (C59186zcL) abstractC59331zeyAkhnZx : null;
        if (c59186zcL != null) {
            if (QOLQEE()) {
                copydefault(sb, (AbstractC59233zdF) c59186zcL.gEmmrt());
                if (AubY()) {
                    KWHzl(sb, c59186zcL);
                    return;
                }
                return;
            }
            copydefault(sb, (AbstractC59233zdF) c59186zcL.valueOf());
            if (ORxRYg()) {
                OLrzqt(sb, c59186zcL);
                return;
            }
            return;
        }
        copydefault(sb, abstractC59233zdF);
    }

    public final void copydefault(java.lang.StringBuilder sb, AbstractC59233zdF abstractC59233zdF) {
        if ((abstractC59233zdF instanceof AbstractC59330zex) && djBIcL() && !((AbstractC59330zex) abstractC59233zdF).AYXKKw()) {
            sb.append("<Not computed yet>");
            return;
        }
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        if (abstractC59331zeyAkhnZx instanceof AbstractC59272zds) {
            sb.append(((AbstractC59272zds) abstractC59331zeyAkhnZx).OLrzqt(this, this));
        } else {
            if (!(abstractC59331zeyAkhnZx instanceof AbstractC59242zdO)) {
                throw new NoWhenBranchMatchedException();
            }
            copydefault(sb, (AbstractC59242zdO) abstractC59331zeyAkhnZx);
        }
    }

    public final void copydefault(java.lang.StringBuilder sb, AbstractC59242zdO abstractC59242zdO) {
        if (Intrinsics.EZpvd(abstractC59242zdO, C59322zep.EZpvd) || C59322zep.gEmmrt(abstractC59242zdO)) {
            sb.append("???");
            return;
        }
        if (C59370zfk.KWHzl(abstractC59242zdO)) {
            if (QbewEr()) {
                InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59242zdO.djBIcL();
                Intrinsics.copydefault(interfaceC59315zeiDjBIcL, "");
                sb.append(copydefault(((C59368zfi) interfaceC59315zeiDjBIcL).EZpvd(0)));
                return;
            }
            sb.append("???");
            return;
        }
        if (C59238zdK.AEQbTJ(abstractC59242zdO)) {
            AEQbTJ(sb, abstractC59242zdO);
        } else if (valueOf(abstractC59242zdO)) {
            EZpvd(sb, abstractC59242zdO);
        } else {
            AEQbTJ(sb, abstractC59242zdO);
        }
    }

    public final boolean valueOf(AbstractC59233zdF abstractC59233zdF) {
        if (C56643yMz.djBIcL(abstractC59233zdF)) {
            java.util.List<InterfaceC59317zek> listBY_ = abstractC59233zdF.bY_();
            if (!(listBY_ instanceof java.util.Collection) || !listBY_.isEmpty()) {
                java.util.Iterator<T> it = listBY_.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC59317zek) it.next()).AEQbTJ()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.yXX
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull AbstractC56640yMw abstractC56640yMw) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        if (C56965yYx.EZpvd(str, str2)) {
            if (C59449zhJ.startsWith$default(str2, "(", false, 2, null)) {
                return '(' + str + ")!";
            }
            return str + '!';
        }
        yXY yxyGEmmrt = gEmmrt();
        InterfaceC56658yNn interfaceC56658yNnDbNXlk = abstractC56640yMw.DbNXlk();
        Intrinsics.checkNotNullExpressionValue(interfaceC56658yNnDbNXlk, "");
        java.lang.String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(yxyGEmmrt.AEQbTJ(interfaceC56658yNnDbNXlk, this), "Collection", (java.lang.String) null, 2, (java.lang.Object) null);
        java.lang.String strOLrzqt = C56965yYx.OLrzqt(str, strSubstringBefore$default + "Mutable", str2, strSubstringBefore$default, strSubstringBefore$default + "(Mutable)");
        if (strOLrzqt != null) {
            return strOLrzqt;
        }
        java.lang.String strOLrzqt2 = C56965yYx.OLrzqt(str, strSubstringBefore$default + "MutableMap.MutableEntry", str2, strSubstringBefore$default + "Map.Entry", strSubstringBefore$default + "(Mutable)Map.(Mutable)Entry");
        if (strOLrzqt2 != null) {
            return strOLrzqt2;
        }
        yXY yxyGEmmrt2 = gEmmrt();
        InterfaceC56658yNn interfaceC56658yNnAYXKKw = abstractC56640yMw.AYXKKw();
        Intrinsics.checkNotNullExpressionValue(interfaceC56658yNnAYXKKw, "");
        java.lang.String strSubstringBefore$default2 = StringsKt__StringsKt.substringBefore$default(yxyGEmmrt2.AEQbTJ(interfaceC56658yNnAYXKKw, this), "Array", (java.lang.String) null, 2, (java.lang.Object) null);
        java.lang.String strOLrzqt3 = C56965yYx.OLrzqt(str, strSubstringBefore$default2 + OLrzqt("Array<"), str2, strSubstringBefore$default2 + OLrzqt("Array<out "), strSubstringBefore$default2 + OLrzqt("Array<(out) "));
        if (strOLrzqt3 != null) {
            return strOLrzqt3;
        }
        return '(' + str + ".." + str2 + ')';
    }

    public java.lang.String copydefault(@NotNull java.util.List<? extends InterfaceC59317zek> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(dvKsVJ());
        KWHzl(sb, list);
        sb.append(finit());
        return sb.toString();
    }

    public final void AEQbTJ(java.lang.StringBuilder sb, AbstractC59233zdF abstractC59233zdF) {
        renderAnnotations$default(this, sb, abstractC59233zdF, null, 2, null);
        C59265zdl c59265zdl = abstractC59233zdF instanceof C59265zdl ? (C59265zdl) abstractC59233zdF : null;
        AbstractC59242zdO abstractC59242zdOAhwBna = c59265zdl != null ? c59265zdl.AhwBna() : null;
        if (C59238zdK.AEQbTJ(abstractC59233zdF)) {
            if (C59336zfC.AYXKKw(abstractC59233zdF) && wlaJM()) {
                sb.append(copydefault(C59370zfk.AEQbTJ.OLrzqt(abstractC59233zdF)));
            } else {
                if ((abstractC59233zdF instanceof C59366zfg) && !ejfBZ()) {
                    sb.append(((C59366zfg) abstractC59233zdF).AhwBna());
                } else {
                    sb.append(abstractC59233zdF.djBIcL().toString());
                }
                sb.append(copydefault(abstractC59233zdF.bY_()));
            }
        } else if (abstractC59233zdF instanceof C59249zdV) {
            sb.append(((C59249zdV) abstractC59233zdF).gEmmrt().toString());
        } else if (abstractC59242zdOAhwBna instanceof C59249zdV) {
            sb.append(((C59249zdV) abstractC59242zdOAhwBna).gEmmrt().toString());
        } else {
            renderTypeConstructorAndArguments$default(this, sb, abstractC59233zdF, null, 2, null);
            Unit unit = Unit.INSTANCE;
        }
        if (abstractC59233zdF.AEQbTJ()) {
            sb.append("?");
        }
        if (C59245zdR.AEQbTJ(abstractC59233zdF)) {
            sb.append(" & Any");
        }
    }

    public static /* synthetic */ void renderTypeConstructorAndArguments$default(C56949yYh c56949yYh, java.lang.StringBuilder sb, AbstractC59233zdF abstractC59233zdF, InterfaceC59315zei interfaceC59315zei, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC59315zei = abstractC59233zdF.djBIcL();
        }
        c56949yYh.AEQbTJ(sb, abstractC59233zdF, interfaceC59315zei);
    }

    public final void AEQbTJ(java.lang.StringBuilder sb, AbstractC59233zdF abstractC59233zdF, InterfaceC59315zei interfaceC59315zei) {
        C56674yOc c56674yOcOLrzqt = C56692yOu.OLrzqt(abstractC59233zdF);
        if (c56674yOcOLrzqt == null) {
            sb.append(KWHzl(interfaceC59315zei));
            sb.append(copydefault(abstractC59233zdF.bY_()));
        } else {
            OLrzqt(sb, c56674yOcOLrzqt);
        }
    }

    public final void OLrzqt(java.lang.StringBuilder sb, C56674yOc c56674yOc) {
        C56674yOc c56674yOcOLrzqt = c56674yOc.OLrzqt();
        if (c56674yOcOLrzqt != null) {
            OLrzqt(sb, c56674yOcOLrzqt);
            sb.append('.');
            C56935yXu c56935yXuBR_ = c56674yOc.KWHzl().bR_();
            Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
            sb.append(EZpvd(c56935yXuBR_, false));
        } else {
            InterfaceC59315zei interfaceC59315zeiFJNWhG = c56674yOc.KWHzl().fJNWhG();
            Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
            sb.append(KWHzl(interfaceC59315zeiFJNWhG));
        }
        sb.append(copydefault(c56674yOc.copydefault()));
    }

    public java.lang.String KWHzl(@NotNull InterfaceC59315zei interfaceC59315zei) {
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = interfaceC59315zei.OLrzqt();
        if ((interfaceC56663yNsOLrzqt instanceof InterfaceC56691yOt) || (interfaceC56663yNsOLrzqt instanceof InterfaceC56658yNn) || (interfaceC56663yNsOLrzqt instanceof InterfaceC56690yOs)) {
            return OLrzqt(interfaceC56663yNsOLrzqt);
        }
        if (interfaceC56663yNsOLrzqt == null) {
            if (interfaceC59315zei instanceof C59228zdA) {
                return ((C59228zdA) interfaceC59315zei).KWHzl(C56956yYo.copydefault);
            }
            return interfaceC59315zei.toString();
        }
        throw new java.lang.IllegalStateException(("Unexpected classifier: " + interfaceC56663yNsOLrzqt.getClass()).toString());
    }

    public static final java.lang.Object EZpvd(AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return abstractC59233zdF instanceof C59249zdV ? ((C59249zdV) abstractC59233zdF).gEmmrt() : abstractC59233zdF;
    }

    @Override // o.yXX
    public java.lang.String OLrzqt(@NotNull InterfaceC59317zek interfaceC59317zek) {
        Intrinsics.checkNotNullParameter(interfaceC59317zek, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        KWHzl(sb, C56402yEa.EZpvd(interfaceC59317zek));
        return sb.toString();
    }

    public final void KWHzl(java.lang.StringBuilder sb, java.util.List<? extends InterfaceC59317zek> list) {
        CollectionsKt___CollectionsKt.joinTo$default(list, sb, ", ", null, null, 0, null, new C56954yYm(this), 60, null);
    }

    public static final java.lang.CharSequence KWHzl(C56949yYh c56949yYh, InterfaceC59317zek interfaceC59317zek) {
        Intrinsics.checkNotNullParameter(interfaceC59317zek, "");
        if (interfaceC59317zek.AEQbTJ()) {
            return "*";
        }
        AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
        java.lang.String strKWHzl = c56949yYh.KWHzl(abstractC59233zdFOLrzqt);
        if (interfaceC59317zek.EZpvd() == Variance.INVARIANT) {
            return strKWHzl;
        }
        return interfaceC59317zek.EZpvd() + ' ' + strKWHzl;
    }

    public final void EZpvd(java.lang.StringBuilder sb, AbstractC59233zdF abstractC59233zdF) {
        C56935yXu c56935yXuOLrzqt;
        int length = sb.length();
        renderAnnotations$default(values(), sb, abstractC59233zdF, null, 2, null);
        boolean z = sb.length() != length;
        AbstractC59233zdF abstractC59233zdFAEQbTJ = C56643yMz.AEQbTJ(abstractC59233zdF);
        java.util.List<AbstractC59233zdF> listEZpvd = C56643yMz.EZpvd(abstractC59233zdF);
        boolean zIsConnected = C56643yMz.isConnected(abstractC59233zdF);
        boolean zAEQbTJ = abstractC59233zdF.AEQbTJ();
        boolean z2 = zAEQbTJ || (z && abstractC59233zdFAEQbTJ != null);
        if (z2) {
            if (zIsConnected) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    CharsKt__CharJVMKt.EZpvd(C59454zhO.zsXlph(sb));
                    if (sb.charAt(StringsKt__StringsKt.fIwbmz(sb) - 1) != ')') {
                        sb.insert(StringsKt__StringsKt.fIwbmz(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        if (!listEZpvd.isEmpty()) {
            sb.append("context(");
            java.util.Iterator<AbstractC59233zdF> it = listEZpvd.subList(0, yDY.AuCTel(listEZpvd)).iterator();
            while (it.hasNext()) {
                KWHzl(sb, it.next());
                sb.append(", ");
            }
            KWHzl(sb, (AbstractC59233zdF) CollectionsKt___CollectionsKt.AubY(listEZpvd));
            sb.append(") ");
        }
        AEQbTJ(sb, zIsConnected, "suspend");
        if (abstractC59233zdFAEQbTJ != null) {
            boolean z3 = (valueOf(abstractC59233zdFAEQbTJ) && !abstractC59233zdFAEQbTJ.AEQbTJ()) || OLrzqt(abstractC59233zdFAEQbTJ) || (abstractC59233zdFAEQbTJ instanceof C59265zdl);
            if (z3) {
                sb.append("(");
            }
            KWHzl(sb, abstractC59233zdFAEQbTJ);
            if (z3) {
                sb.append(")");
            }
            sb.append(JwtUtilsKt.JWT_DELIMITER);
        }
        sb.append("(");
        if (C56643yMz.gEmmrt(abstractC59233zdF) && abstractC59233zdF.bY_().size() <= 1) {
            sb.append("???");
        } else {
            int i = 0;
            for (InterfaceC59317zek interfaceC59317zek : C56643yMz.AhwBna(abstractC59233zdF)) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (zsXlph()) {
                    AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
                    Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
                    c56935yXuOLrzqt = C56643yMz.OLrzqt(abstractC59233zdFOLrzqt);
                } else {
                    c56935yXuOLrzqt = null;
                }
                if (c56935yXuOLrzqt != null) {
                    sb.append(EZpvd(c56935yXuOLrzqt, false));
                    sb.append(": ");
                }
                sb.append(OLrzqt(interfaceC59317zek));
                i++;
            }
        }
        sb.append(") ");
        sb.append(OLrzqt());
        sb.append(" ");
        KWHzl(sb, C56643yMz.valueOf(abstractC59233zdF));
        if (z2) {
            sb.append(")");
        }
        if (zAEQbTJ) {
            sb.append("?");
        }
    }

    public final boolean OLrzqt(AbstractC59233zdF abstractC59233zdF) {
        return C56643yMz.isConnected(abstractC59233zdF) || !abstractC59233zdF.copydefault().AEQbTJ();
    }

    public final void copydefault(java.lang.StringBuilder sb, InterfaceC56665yNu interfaceC56665yNu) {
        InterfaceC56665yNu interfaceC56665yNuAuCTel;
        java.lang.String strKWHzl;
        if ((interfaceC56665yNu instanceof yNW) || (interfaceC56665yNu instanceof yNY) || (interfaceC56665yNuAuCTel = interfaceC56665yNu.AuCTel()) == null || (interfaceC56665yNuAuCTel instanceof yNP)) {
            return;
        }
        sb.append(" ");
        sb.append(EZpvd("defined in"));
        sb.append(" ");
        C56930yXp c56930yXpAEQbTJ = yYH.AEQbTJ(interfaceC56665yNuAuCTel);
        Intrinsics.checkNotNullExpressionValue(c56930yXpAEQbTJ, "");
        sb.append(c56930yXpAEQbTJ.OLrzqt() ? "root package" : copydefault(c56930yXpAEQbTJ));
        if (RcXXUw() && (interfaceC56665yNuAuCTel instanceof yNW) && (interfaceC56665yNu instanceof InterfaceC56664yNt) && (strKWHzl = ((InterfaceC56664yNt) interfaceC56665yNu).fARcdN().copydefault().KWHzl()) != null) {
            sb.append(" ");
            sb.append(EZpvd("in file"));
            sb.append(" ");
            sb.append(strKWHzl);
        }
    }

    public static /* synthetic */ void renderAnnotations$default(C56949yYh c56949yYh, java.lang.StringBuilder sb, yOB yob, AnnotationUseSiteTarget annotationUseSiteTarget, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        c56949yYh.OLrzqt(sb, yob, annotationUseSiteTarget);
    }

    public final void OLrzqt(java.lang.StringBuilder sb, yOB yob, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (iwGUEr().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            java.util.Set<C56933yXs> setDbNXlk = yob instanceof AbstractC59233zdF ? DbNXlk() : fetchVPNInfo();
            Function1<yOJ, java.lang.Boolean> function1KWHzl = KWHzl();
            for (yOJ yoj : yob.copydefault()) {
                if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends C56933yXs>) ((java.lang.Iterable<? extends java.lang.Object>) setDbNXlk), yoj.KWHzl()) && !EZpvd(yoj) && (function1KWHzl == null || function1KWHzl.invoke(yoj).booleanValue())) {
                    sb.append(OLrzqt(yoj, annotationUseSiteTarget));
                    if (isConnected()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final boolean EZpvd(yOJ yoj) {
        return Intrinsics.EZpvd(yoj.KWHzl(), yMB.Application.AxsJAYaxsJAY);
    }

    @Override // o.yXX
    public java.lang.String OLrzqt(@NotNull yOJ yoj, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Intrinsics.checkNotNullParameter(yoj, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.getRenderName() + AbstractJsonLexerKt.COLON);
        }
        AbstractC59233zdF abstractC59233zdFAEQbTJ = yoj.AEQbTJ();
        sb.append(KWHzl(abstractC59233zdFAEQbTJ));
        if (fARcdN()) {
            java.util.List<java.lang.String> listKWHzl = KWHzl(yoj);
            if (AuCTel() || (!listKWHzl.isEmpty())) {
                CollectionsKt___CollectionsKt.joinTo$default(listKWHzl, sb, ", ", "(", ")", 0, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            }
        }
        if (aKErDB() && (C59238zdK.AEQbTJ(abstractC59233zdFAEQbTJ) || (abstractC59233zdFAEQbTJ.djBIcL().OLrzqt() instanceof yNO.Activity))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final java.util.List<java.lang.String> KWHzl(yOJ yoj) {
        InterfaceC56656yNl interfaceC56656yNlUzCIH;
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo;
        java.util.Map<C56935yXu, AbstractC56975yZg<?>> mapOLrzqt = yoj.OLrzqt();
        java.util.List listAhwBna = null;
        InterfaceC56658yNn interfaceC56658yNnOLrzqt = sSMYrx() ? yZE.OLrzqt(yoj) : null;
        if (interfaceC56658yNnOLrzqt != null && (interfaceC56656yNlUzCIH = interfaceC56658yNnOLrzqt.uzCIH()) != null && (listFetchVPNInfo = interfaceC56656yNlUzCIH.fetchVPNInfo()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listFetchVPNInfo) {
                if (((InterfaceC56695yOx) obj).EZpvd()) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InterfaceC56695yOx) it.next()).bR_());
            }
            listAhwBna = arrayList2;
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listAhwBna) {
            if (!mapOLrzqt.containsKey((C56935yXu) obj2)) {
                arrayList3.add(obj2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C56935yXu) it2.next()).AEQbTJ() + " = ...");
        }
        java.util.Set<Map.Entry<C56935yXu, AbstractC56975yZg<?>>> setEntrySet = mapOLrzqt.entrySet();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(setEntrySet, 10));
        java.util.Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            C56935yXu c56935yXu = (C56935yXu) entry.getKey();
            AbstractC56975yZg<?> abstractC56975yZg = (AbstractC56975yZg) entry.getValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(c56935yXu.AEQbTJ());
            sb.append(" = ");
            sb.append(!listAhwBna.contains(c56935yXu) ? OLrzqt(abstractC56975yZg) : "...");
            arrayList5.add(sb.toString());
        }
        return CollectionsKt___CollectionsKt.AxsJAYaxsJAY(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList4, (java.lang.Iterable) arrayList5));
    }

    public final java.lang.String OLrzqt(AbstractC56975yZg<?> abstractC56975yZg) {
        Function1<AbstractC56975yZg<?>, java.lang.String> function1AubY = this.fetchVPNInfo.AubY();
        if (function1AubY != null) {
            return function1AubY.invoke(abstractC56975yZg);
        }
        if (!(abstractC56975yZg instanceof C56971yZc)) {
            if (abstractC56975yZg instanceof C56970yZb) {
                return StringsKt__StringsKt.KWHzl(yXX.renderAnnotation$default(this, ((C56970yZb) abstractC56975yZg).KWHzl(), null, 2, null), (java.lang.CharSequence) "@");
            }
            if (abstractC56975yZg instanceof C56984yZp) {
                C56984yZp.ActionBar actionBarKWHzl = ((C56984yZp) abstractC56975yZg).KWHzl();
                if (actionBarKWHzl instanceof C56984yZp.ActionBar.Application) {
                    return ((C56984yZp.ActionBar.Application) actionBarKWHzl).AEQbTJ() + "::class";
                }
                if (!(actionBarKWHzl instanceof C56984yZp.ActionBar.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                C56984yZp.ActionBar.Activity activity = (C56984yZp.ActionBar.Activity) actionBarKWHzl;
                java.lang.String strKWHzl = activity.KWHzl().AEQbTJ().KWHzl();
                for (int i = 0; i < activity.OLrzqt(); i++) {
                    strKWHzl = "kotlin.Array<" + strKWHzl + '>';
                }
                return strKWHzl + "::class";
            }
            return abstractC56975yZg.toString();
        }
        java.util.List<? extends AbstractC56975yZg<?>> listKWHzl = ((C56971yZc) abstractC56975yZg).KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            java.lang.String strOLrzqt = OLrzqt((AbstractC56975yZg<?>) it.next());
            if (strOLrzqt != null) {
                arrayList.add(strOLrzqt);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "{", "}", 0, null, null, 56, null);
    }

    public final boolean AEQbTJ(yNC ync, java.lang.StringBuilder sb) {
        if (!iwGUEr().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNewProxyInstance()) {
            ync = ync.KWHzl();
        }
        if (!DTwDnp() && Intrinsics.EZpvd(ync, C56669yNy.OLrzqt)) {
            return false;
        }
        sb.append(KWHzl(ync.EZpvd()));
        sb.append(" ");
        return true;
    }

    public final void KWHzl(Modality modality, java.lang.StringBuilder sb, Modality modality2) {
        if (AxsJAY() || modality != modality2) {
            AEQbTJ(sb, iwGUEr().contains(DescriptorRendererModifier.MODALITY), C59428zgp.OLrzqt(modality.name()));
        }
    }

    public final Modality OLrzqt(yNJ ynj) {
        if (ynj instanceof InterfaceC56658yNn) {
            return ((InterfaceC56658yNn) ynj).DbNXlk() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        InterfaceC56665yNu interfaceC56665yNuAuCTel = ynj.AuCTel();
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56665yNuAuCTel instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56665yNuAuCTel : null;
        if (interfaceC56658yNn != null && (ynj instanceof CallableMemberDescriptor)) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) ynj;
            Intrinsics.checkNotNullExpressionValue(callableMemberDescriptor.valueOf(), "");
            if ((!r1.isEmpty()) && interfaceC56658yNn.isConnected() != Modality.FINAL) {
                return Modality.OPEN;
            }
            if (interfaceC56658yNn.DbNXlk() == ClassKind.INTERFACE && !Intrinsics.EZpvd(callableMemberDescriptor.getNewProxyInstance(), C56669yNy.AkhnZx)) {
                Modality modalityIsConnected = callableMemberDescriptor.isConnected();
                Modality modality = Modality.ABSTRACT;
                return modalityIsConnected == modality ? modality : Modality.OPEN;
            }
            return Modality.FINAL;
        }
        return Modality.FINAL;
    }

    public final void copydefault(CallableMemberDescriptor callableMemberDescriptor, java.lang.StringBuilder sb) {
        if (yYH.ejfBZ(callableMemberDescriptor) && callableMemberDescriptor.isConnected() == Modality.FINAL) {
            return;
        }
        if (hDKMBd() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.isConnected() == Modality.OPEN && OLrzqt(callableMemberDescriptor)) {
            return;
        }
        Modality modalityIsConnected = callableMemberDescriptor.isConnected();
        Intrinsics.checkNotNullExpressionValue(modalityIsConnected, "");
        KWHzl(modalityIsConnected, sb, OLrzqt((yNJ) callableMemberDescriptor));
    }

    public final void OLrzqt(CallableMemberDescriptor callableMemberDescriptor, java.lang.StringBuilder sb) {
        if (iwGUEr().contains(DescriptorRendererModifier.OVERRIDE) && OLrzqt(callableMemberDescriptor) && hDKMBd() != OverrideRenderingPolicy.RENDER_OPEN) {
            AEQbTJ(sb, true, "override");
            if (aKErDB()) {
                sb.append("/*");
                sb.append(callableMemberDescriptor.valueOf().size());
                sb.append("*/ ");
            }
        }
    }

    public final void AEQbTJ(CallableMemberDescriptor callableMemberDescriptor, java.lang.StringBuilder sb) {
        if (iwGUEr().contains(DescriptorRendererModifier.MEMBER_KIND) && aKErDB() && callableMemberDescriptor.bW_() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            sb.append(C59428zgp.OLrzqt(callableMemberDescriptor.bW_().name()));
            sb.append("*/ ");
        }
    }

    public final void AEQbTJ(java.lang.StringBuilder sb, boolean z, java.lang.String str) {
        if (z) {
            sb.append(KWHzl(str));
            sb.append(" ");
        }
    }

    public final void copydefault(yNJ ynj, java.lang.StringBuilder sb) {
        AEQbTJ(sb, ynj.zsXlph(), "external");
        AEQbTJ(sb, iwGUEr().contains(DescriptorRendererModifier.EXPECT) && ynj.zLjUOn(), "expect");
        AEQbTJ(sb, iwGUEr().contains(DescriptorRendererModifier.ACTUAL) && ynj.hDKMBd(), "actual");
    }

    public final void EZpvd(yNG yng, java.lang.StringBuilder sb) {
        boolean z;
        boolean z2 = true;
        if (yng.AwvSrB()) {
            java.util.Collection<? extends yNG> collectionValueOf = yng.valueOf();
            Intrinsics.checkNotNullExpressionValue(collectionValueOf, "");
            java.util.Collection<? extends yNG> collection = collectionValueOf;
            if (!collection.isEmpty()) {
                java.util.Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((yNG) it.next()).AwvSrB()) {
                        if (copydefault()) {
                            break;
                        }
                    }
                }
                z = false;
            }
            z = true;
        } else {
            z = false;
        }
        if (yng.AuCTelauCTel()) {
            java.util.Collection<? extends yNG> collectionValueOf2 = yng.valueOf();
            Intrinsics.checkNotNullExpressionValue(collectionValueOf2, "");
            java.util.Collection<? extends yNG> collection2 = collectionValueOf2;
            if (!collection2.isEmpty()) {
                java.util.Iterator<T> it2 = collection2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((yNG) it2.next()).AuCTelauCTel()) {
                        if (!copydefault()) {
                        }
                    }
                }
                z2 = false;
            }
        } else {
            z2 = false;
        }
        AEQbTJ(sb, yng.KWHzl(), "tailrec");
        AEQbTJ(yng, sb);
        AEQbTJ(sb, yng.EZpvd(), "inline");
        AEQbTJ(sb, z2, "infix");
        AEQbTJ(sb, z, "operator");
    }

    public final void AEQbTJ(yNG yng, java.lang.StringBuilder sb) {
        AEQbTJ(sb, yng.AxsJAY(), "suspend");
    }

    @Override // o.yXX
    public java.lang.String copydefault(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        interfaceC56665yNu.AEQbTJ(new Activity(), sb);
        if (dNCPSb()) {
            copydefault(sb, interfaceC56665yNu);
        }
        return sb.toString();
    }

    public final void OLrzqt(InterfaceC56691yOt interfaceC56691yOt, java.lang.StringBuilder sb, boolean z) {
        if (z) {
            sb.append(dvKsVJ());
        }
        if (aKErDB()) {
            sb.append("/*");
            sb.append(interfaceC56691yOt.AEQbTJ());
            sb.append("*/ ");
        }
        AEQbTJ(sb, interfaceC56691yOt.isConnected(), "reified");
        java.lang.String label = interfaceC56691yOt.values().getLabel();
        boolean z2 = true;
        AEQbTJ(sb, label.length() > 0, label);
        renderAnnotations$default(this, sb, interfaceC56691yOt, null, 2, null);
        AEQbTJ(interfaceC56691yOt, sb, z);
        int size = interfaceC56691yOt.djBIcL().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC59233zdF next = interfaceC56691yOt.djBIcL().iterator().next();
            if (!AbstractC56640yMw.gEmmrt(next)) {
                sb.append(" : ");
                Intrinsics.copydefault(next);
                sb.append(KWHzl(next));
            }
        } else if (z) {
            for (AbstractC59233zdF abstractC59233zdF : interfaceC56691yOt.djBIcL()) {
                if (!AbstractC56640yMw.gEmmrt(abstractC59233zdF)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    Intrinsics.copydefault(abstractC59233zdF);
                    sb.append(KWHzl(abstractC59233zdF));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(finit());
        }
    }

    public final void copydefault(java.util.List<? extends InterfaceC56691yOt> list, java.lang.StringBuilder sb, boolean z) {
        if (!fZBcTu() && (!list.isEmpty())) {
            sb.append(dvKsVJ());
            copydefault(sb, list);
            sb.append(finit());
            if (z) {
                sb.append(" ");
            }
        }
    }

    public final void copydefault(java.lang.StringBuilder sb, java.util.List<? extends InterfaceC56691yOt> list) {
        java.util.Iterator<? extends InterfaceC56691yOt> it = list.iterator();
        while (it.hasNext()) {
            OLrzqt(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public final void copydefault(yNG yng, java.lang.StringBuilder sb) {
        if (!QUSxYX()) {
            if (!QVAiDq()) {
                java.util.List<InterfaceC56679yOh> listOLrzqt = yng.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(listOLrzqt, "");
                copydefault(listOLrzqt, sb);
                renderAnnotations$default(this, sb, yng, null, 2, null);
                yNC newProxyInstance = yng.getNewProxyInstance();
                Intrinsics.checkNotNullExpressionValue(newProxyInstance, "");
                AEQbTJ(newProxyInstance, sb);
                copydefault((CallableMemberDescriptor) yng, sb);
                if (fIwbmz()) {
                    copydefault((yNJ) yng, sb);
                }
                OLrzqt(yng, sb);
                if (fIwbmz()) {
                    EZpvd(yng, sb);
                } else {
                    AEQbTJ(yng, sb);
                }
                AEQbTJ((CallableMemberDescriptor) yng, sb);
                if (aKErDB()) {
                    if (yng.wlaJM()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (yng.AubY()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(KWHzl("fun"));
            sb.append(" ");
            java.util.List<InterfaceC56691yOt> listAkhnZx = yng.AkhnZx();
            Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
            copydefault((java.util.List<? extends InterfaceC56691yOt>) listAkhnZx, sb, true);
            KWHzl(yng, sb);
        }
        AEQbTJ((InterfaceC56665yNu) yng, sb, true);
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = yng.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        copydefault(listFetchVPNInfo, yng.values(), sb);
        AEQbTJ((InterfaceC56657yNm) yng, sb);
        AbstractC59233zdF abstractC59233zdFGEmmrt = yng.gEmmrt();
        if (!dxcTrN() && (UeEOUB() || abstractC59233zdFGEmmrt == null || !AbstractC56640yMw.fIwbmz(abstractC59233zdFGEmmrt))) {
            sb.append(": ");
            sb.append(abstractC59233zdFGEmmrt == null ? "[NULL]" : KWHzl(abstractC59233zdFGEmmrt));
        }
        java.util.List<InterfaceC56691yOt> listAkhnZx2 = yng.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(listAkhnZx2, "");
        KWHzl(listAkhnZx2, sb);
    }

    public final void AEQbTJ(InterfaceC56657yNm interfaceC56657yNm, java.lang.StringBuilder sb) {
        InterfaceC56679yOh interfaceC56679yOhDjBIcL;
        if (AuCTelauCTel() && (interfaceC56679yOhDjBIcL = interfaceC56657yNm.djBIcL()) != null) {
            sb.append(" on ");
            AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56679yOhDjBIcL.uzCIH();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
            sb.append(KWHzl(abstractC59233zdFUzCIH));
        }
    }

    public final java.lang.String copydefault(AbstractC59233zdF abstractC59233zdF) {
        java.lang.String strKWHzl = KWHzl(abstractC59233zdF);
        if ((!valueOf(abstractC59233zdF) || C59322zep.valueOf(abstractC59233zdF)) && !(abstractC59233zdF instanceof C59265zdl)) {
            return strKWHzl;
        }
        return '(' + strKWHzl + ')';
    }

    public final void copydefault(java.util.List<? extends InterfaceC56679yOh> list, java.lang.StringBuilder sb) {
        if (!list.isEmpty()) {
            sb.append("context(");
            int i = 0;
            for (InterfaceC56679yOh interfaceC56679yOh : list) {
                OLrzqt(sb, interfaceC56679yOh, AnnotationUseSiteTarget.RECEIVER);
                AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56679yOh.uzCIH();
                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
                sb.append(copydefault(abstractC59233zdFUzCIH));
                if (i == yDY.AuCTel(list)) {
                    sb.append(") ");
                } else {
                    sb.append(", ");
                }
                i++;
            }
        }
    }

    public final void KWHzl(InterfaceC56657yNm interfaceC56657yNm, java.lang.StringBuilder sb) {
        InterfaceC56679yOh interfaceC56679yOhDjBIcL = interfaceC56657yNm.djBIcL();
        if (interfaceC56679yOhDjBIcL != null) {
            OLrzqt(sb, interfaceC56679yOhDjBIcL, AnnotationUseSiteTarget.RECEIVER);
            AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56679yOhDjBIcL.uzCIH();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
            sb.append(copydefault(abstractC59233zdFUzCIH));
            sb.append(JwtUtilsKt.JWT_DELIMITER);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(InterfaceC56660yNp interfaceC56660yNp, java.lang.StringBuilder sb) {
        boolean z;
        InterfaceC56656yNl interfaceC56656yNlUzCIH;
        renderAnnotations$default(this, sb, interfaceC56660yNp, null, 2, null);
        if (this.fetchVPNInfo.AxsJAY() || interfaceC56660yNp.fIwbmz().isConnected() != Modality.SEALED) {
            yNC newProxyInstance = interfaceC56660yNp.getNewProxyInstance();
            Intrinsics.checkNotNullExpressionValue(newProxyInstance, "");
            z = AEQbTJ(newProxyInstance, sb);
        }
        AEQbTJ((CallableMemberDescriptor) interfaceC56660yNp, sb);
        boolean z2 = AwvSrB() || !interfaceC56660yNp.getFieldNames() || z;
        if (z2) {
            sb.append(KWHzl("constructor"));
        }
        InterfaceC56659yNo interfaceC56659yNoAuCTel = interfaceC56660yNp.AuCTel();
        Intrinsics.checkNotNullExpressionValue(interfaceC56659yNoAuCTel, "");
        if (OcIXYQ()) {
            if (z2) {
                sb.append(" ");
            }
            AEQbTJ((InterfaceC56665yNu) interfaceC56659yNoAuCTel, sb, true);
            java.util.List<InterfaceC56691yOt> listAkhnZx = interfaceC56660yNp.AkhnZx();
            Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
            copydefault((java.util.List<? extends InterfaceC56691yOt>) listAkhnZx, sb, false);
        }
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = interfaceC56660yNp.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        copydefault(listFetchVPNInfo, interfaceC56660yNp.values(), sb);
        if (gHZMYf() && !interfaceC56660yNp.getFieldNames() && (interfaceC56659yNoAuCTel instanceof InterfaceC56658yNn) && (interfaceC56656yNlUzCIH = ((InterfaceC56658yNn) interfaceC56659yNoAuCTel).uzCIH()) != null) {
            java.util.List<InterfaceC56695yOx> listFetchVPNInfo2 = interfaceC56656yNlUzCIH.fetchVPNInfo();
            Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo2, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listFetchVPNInfo2) {
                InterfaceC56695yOx interfaceC56695yOx = (InterfaceC56695yOx) obj;
                if (!interfaceC56695yOx.EZpvd() && interfaceC56695yOx.ejfBZ() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(KWHzl("this"));
                sb.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "(", ")", 0, null, C56955yYn.copydefault, 24, null));
            }
        }
        if (OcIXYQ()) {
            java.util.List<InterfaceC56691yOt> listAkhnZx2 = interfaceC56660yNp.AkhnZx();
            Intrinsics.checkNotNullExpressionValue(listAkhnZx2, "");
            KWHzl(listAkhnZx2, sb);
        }
    }

    public final void KWHzl(java.util.List<? extends InterfaceC56691yOt> list, java.lang.StringBuilder sb) {
        if (fZBcTu()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        for (InterfaceC56691yOt interfaceC56691yOt : list) {
            java.util.List<AbstractC59233zdF> listDjBIcL = interfaceC56691yOt.djBIcL();
            Intrinsics.checkNotNullExpressionValue(listDjBIcL, "");
            for (AbstractC59233zdF abstractC59233zdF : CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listDjBIcL, 1)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                C56935yXu c56935yXuBR_ = interfaceC56691yOt.bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                sb2.append(EZpvd(c56935yXuBR_, false));
                sb2.append(" : ");
                Intrinsics.copydefault(abstractC59233zdF);
                sb2.append(KWHzl(abstractC59233zdF));
                arrayList.add(sb2.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb.append(" ");
            sb.append(KWHzl("where"));
            sb.append(" ");
            CollectionsKt___CollectionsKt.joinTo$default(arrayList, sb, ", ", null, null, 0, null, null, 124, null);
        }
    }

    public final void copydefault(java.util.Collection<? extends InterfaceC56695yOx> collection, boolean z, java.lang.StringBuilder sb) {
        boolean zGEmmrt = gEmmrt(z);
        int size = collection.size();
        djSkpj().copydefault(size, sb);
        int i = 0;
        for (InterfaceC56695yOx interfaceC56695yOx : collection) {
            djSkpj().OLrzqt(interfaceC56695yOx, i, size, sb);
            copydefault(interfaceC56695yOx, zGEmmrt, sb, false);
            djSkpj().KWHzl(interfaceC56695yOx, i, size, sb);
            i++;
        }
        djSkpj().KWHzl(size, sb);
    }

    public final boolean gEmmrt(boolean z) {
        int i = TaskDescription.OLrzqt[getFieldNames().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(InterfaceC56695yOx interfaceC56695yOx, boolean z, java.lang.StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(KWHzl("value-parameter"));
            sb.append(" ");
        }
        if (aKErDB()) {
            sb.append("/*");
            sb.append(interfaceC56695yOx.isConnected());
            sb.append("*/ ");
        }
        renderAnnotations$default(this, sb, interfaceC56695yOx, null, 2, null);
        AEQbTJ(sb, interfaceC56695yOx.fIwbmz(), "crossinline");
        AEQbTJ(sb, interfaceC56695yOx.AuCTel(), "noinline");
        if (QKVWgx()) {
            InterfaceC56657yNm interfaceC56657yNmAYXKKw = interfaceC56695yOx.AYXKKw();
            InterfaceC56656yNl interfaceC56656yNl = interfaceC56657yNmAYXKKw instanceof InterfaceC56656yNl ? (InterfaceC56656yNl) interfaceC56657yNmAYXKKw : null;
            if (interfaceC56656yNl != null) {
                z3 = interfaceC56656yNl.getFieldNames();
            }
        }
        boolean z4 = z3;
        if (z4) {
            AEQbTJ(sb, AEQbTJ(), "actual");
        }
        AEQbTJ(interfaceC56695yOx, z, sb, z2, z4);
        if (AYXKKw() != null) {
            if (djBIcL() ? interfaceC56695yOx.EZpvd() : yZE.copydefault(interfaceC56695yOx)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(" = ");
                Function1<InterfaceC56695yOx, java.lang.String> function1AYXKKw = AYXKKw();
                Intrinsics.copydefault(function1AYXKKw);
                sb2.append(function1AYXKKw.invoke(interfaceC56695yOx));
                sb.append(sb2.toString());
            }
        }
    }

    public static /* synthetic */ void renderValVarPrefix$default(C56949yYh c56949yYh, yOC yoc, java.lang.StringBuilder sb, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c56949yYh.KWHzl(yoc, sb, z);
    }

    public final void KWHzl(yOC yoc, java.lang.StringBuilder sb, boolean z) {
        if (z || !(yoc instanceof InterfaceC56695yOx)) {
            sb.append(KWHzl(yoc.AubY() ? "var" : "val"));
            sb.append(" ");
        }
    }

    public final void AEQbTJ(yOC yoc, boolean z, java.lang.StringBuilder sb, boolean z2, boolean z3) {
        AbstractC59233zdF abstractC59233zdFUzCIH = yoc.uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        InterfaceC56695yOx interfaceC56695yOx = yoc instanceof InterfaceC56695yOx ? (InterfaceC56695yOx) yoc : null;
        AbstractC59233zdF abstractC59233zdFEjfBZ = interfaceC56695yOx != null ? interfaceC56695yOx.ejfBZ() : null;
        AbstractC59233zdF abstractC59233zdF = abstractC59233zdFEjfBZ == null ? abstractC59233zdFUzCIH : abstractC59233zdFEjfBZ;
        AEQbTJ(sb, abstractC59233zdFEjfBZ != null, "vararg");
        if (z3 || (z2 && !QUSxYX())) {
            KWHzl(yoc, sb, z3);
        }
        if (z) {
            AEQbTJ(yoc, sb, z2);
            sb.append(": ");
        }
        sb.append(KWHzl(abstractC59233zdF));
        KWHzl(yoc, sb);
        if (!aKErDB() || abstractC59233zdFEjfBZ == null) {
            return;
        }
        sb.append(" /*");
        sb.append(KWHzl(abstractC59233zdFUzCIH));
        sb.append("*/");
    }

    public final void copydefault(InterfaceC56676yOe interfaceC56676yOe, java.lang.StringBuilder sb) {
        if (!QUSxYX()) {
            if (!QVAiDq()) {
                java.util.List<InterfaceC56679yOh> listOLrzqt = interfaceC56676yOe.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(listOLrzqt, "");
                copydefault(listOLrzqt, sb);
                KWHzl(interfaceC56676yOe, sb);
                yNC newProxyInstance = interfaceC56676yOe.getNewProxyInstance();
                Intrinsics.checkNotNullExpressionValue(newProxyInstance, "");
                AEQbTJ(newProxyInstance, sb);
                boolean z = false;
                AEQbTJ(sb, iwGUEr().contains(DescriptorRendererModifier.CONST) && interfaceC56676yOe.wlaJM(), "const");
                copydefault((yNJ) interfaceC56676yOe, sb);
                copydefault((CallableMemberDescriptor) interfaceC56676yOe, sb);
                OLrzqt(interfaceC56676yOe, sb);
                if (iwGUEr().contains(DescriptorRendererModifier.LATEINIT) && interfaceC56676yOe.AuCTelauCTel()) {
                    z = true;
                }
                AEQbTJ(sb, z, "lateinit");
                AEQbTJ((CallableMemberDescriptor) interfaceC56676yOe, sb);
            }
            renderValVarPrefix$default(this, interfaceC56676yOe, sb, false, 4, null);
            java.util.List<InterfaceC56691yOt> listAkhnZx = interfaceC56676yOe.AkhnZx();
            Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
            copydefault((java.util.List<? extends InterfaceC56691yOt>) listAkhnZx, sb, true);
            KWHzl((InterfaceC56657yNm) interfaceC56676yOe, sb);
        }
        AEQbTJ((InterfaceC56665yNu) interfaceC56676yOe, sb, true);
        sb.append(": ");
        AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56676yOe.uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        sb.append(KWHzl(abstractC59233zdFUzCIH));
        AEQbTJ((InterfaceC56657yNm) interfaceC56676yOe, sb);
        KWHzl((yOC) interfaceC56676yOe, sb);
        java.util.List<InterfaceC56691yOt> listAkhnZx2 = interfaceC56676yOe.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(listAkhnZx2, "");
        KWHzl(listAkhnZx2, sb);
    }

    public final void KWHzl(InterfaceC56676yOe interfaceC56676yOe, java.lang.StringBuilder sb) {
        if (iwGUEr().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            renderAnnotations$default(this, sb, interfaceC56676yOe, null, 2, null);
            yND yndEZpvd = interfaceC56676yOe.EZpvd();
            if (yndEZpvd != null) {
                OLrzqt(sb, yndEZpvd, AnnotationUseSiteTarget.FIELD);
            }
            yND yndFIwbmz = interfaceC56676yOe.fIwbmz();
            if (yndFIwbmz != null) {
                OLrzqt(sb, yndFIwbmz, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (zLjUOn() == PropertyAccessorRenderingPolicy.NONE) {
                InterfaceC56675yOd interfaceC56675yOdEjfBZ = interfaceC56676yOe.ejfBZ();
                if (interfaceC56675yOdEjfBZ != null) {
                    OLrzqt(sb, interfaceC56675yOdEjfBZ, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                InterfaceC56680yOi fieldNames = interfaceC56676yOe.getFieldNames();
                if (fieldNames != null) {
                    OLrzqt(sb, fieldNames, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    java.util.List<InterfaceC56695yOx> listFetchVPNInfo = fieldNames.fetchVPNInfo();
                    Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
                    InterfaceC56695yOx interfaceC56695yOx = (InterfaceC56695yOx) CollectionsKt___CollectionsKt.gHZMYf(listFetchVPNInfo);
                    Intrinsics.copydefault(interfaceC56695yOx);
                    OLrzqt(sb, interfaceC56695yOx, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    public final void KWHzl(yOC yoc, java.lang.StringBuilder sb) {
        AbstractC56975yZg<?> abstractC56975yZgIwGUEr;
        java.lang.String strOLrzqt;
        if (!fJNWhG() || (abstractC56975yZgIwGUEr = yoc.iwGUEr()) == null || (strOLrzqt = OLrzqt(abstractC56975yZgIwGUEr)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(OLrzqt(strOLrzqt));
    }

    public final void KWHzl(InterfaceC56690yOs interfaceC56690yOs, java.lang.StringBuilder sb) {
        renderAnnotations$default(this, sb, interfaceC56690yOs, null, 2, null);
        yNC newProxyInstance = interfaceC56690yOs.getNewProxyInstance();
        Intrinsics.checkNotNullExpressionValue(newProxyInstance, "");
        AEQbTJ(newProxyInstance, sb);
        copydefault(interfaceC56690yOs, sb);
        sb.append(KWHzl("typealias"));
        sb.append(" ");
        AEQbTJ((InterfaceC56665yNu) interfaceC56690yOs, sb, true);
        java.util.List<InterfaceC56691yOt> listAkhnZx = interfaceC56690yOs.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
        copydefault((java.util.List<? extends InterfaceC56691yOt>) listAkhnZx, sb, false);
        EZpvd((InterfaceC56659yNo) interfaceC56690yOs, sb);
        sb.append(" = ");
        sb.append(KWHzl(interfaceC56690yOs.djBIcL()));
    }

    public final void EZpvd(InterfaceC56659yNo interfaceC56659yNo, java.lang.StringBuilder sb) {
        java.util.List<InterfaceC56691yOt> listAkhnZx = interfaceC56659yNo.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
        java.util.List<InterfaceC56691yOt> listCopydefault = interfaceC56659yNo.fJNWhG().copydefault();
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        if (aKErDB() && interfaceC56659yNo.gHZMYf() && listCopydefault.size() > listAkhnZx.size()) {
            sb.append(" /*captured type parameters: ");
            copydefault(sb, listCopydefault.subList(listAkhnZx.size(), listCopydefault.size()));
            sb.append("*/");
        }
    }

    public final void KWHzl(InterfaceC56658yNn interfaceC56658yNn, java.lang.StringBuilder sb) {
        InterfaceC56656yNl interfaceC56656yNlUzCIH;
        boolean z = interfaceC56658yNn.DbNXlk() == ClassKind.ENUM_ENTRY;
        if (!QUSxYX()) {
            java.util.List<InterfaceC56679yOh> listAxsJAY = interfaceC56658yNn.AxsJAY();
            Intrinsics.checkNotNullExpressionValue(listAxsJAY, "");
            copydefault(listAxsJAY, sb);
            renderAnnotations$default(this, sb, interfaceC56658yNn, null, 2, null);
            if (!z) {
                yNC newProxyInstance = interfaceC56658yNn.getNewProxyInstance();
                Intrinsics.checkNotNullExpressionValue(newProxyInstance, "");
                AEQbTJ(newProxyInstance, sb);
            }
            if ((interfaceC56658yNn.DbNXlk() != ClassKind.INTERFACE || interfaceC56658yNn.isConnected() != Modality.ABSTRACT) && (!interfaceC56658yNn.DbNXlk().isSingleton() || interfaceC56658yNn.isConnected() != Modality.FINAL)) {
                Modality modalityIsConnected = interfaceC56658yNn.isConnected();
                Intrinsics.checkNotNullExpressionValue(modalityIsConnected, "");
                KWHzl(modalityIsConnected, sb, OLrzqt((yNJ) interfaceC56658yNn));
            }
            copydefault(interfaceC56658yNn, sb);
            AEQbTJ(sb, iwGUEr().contains(DescriptorRendererModifier.INNER) && interfaceC56658yNn.gHZMYf(), "inner");
            AEQbTJ(sb, iwGUEr().contains(DescriptorRendererModifier.DATA) && interfaceC56658yNn.AubY(), "data");
            AEQbTJ(sb, iwGUEr().contains(DescriptorRendererModifier.INLINE) && interfaceC56658yNn.sSMYrx(), "inline");
            AEQbTJ(sb, iwGUEr().contains(DescriptorRendererModifier.VALUE) && interfaceC56658yNn.AwvSrB(), "value");
            AEQbTJ(sb, iwGUEr().contains(DescriptorRendererModifier.FUN) && interfaceC56658yNn.wlaJM(), "fun");
            EZpvd(interfaceC56658yNn, sb);
        }
        if (!yYH.isConnected(interfaceC56658yNn)) {
            if (!QUSxYX()) {
                KWHzl(sb);
            }
            AEQbTJ((InterfaceC56665yNu) interfaceC56658yNn, sb, true);
        } else {
            EZpvd((InterfaceC56665yNu) interfaceC56658yNn, sb);
        }
        if (z) {
            return;
        }
        java.util.List<InterfaceC56691yOt> listAkhnZx = interfaceC56658yNn.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
        copydefault((java.util.List<? extends InterfaceC56691yOt>) listAkhnZx, sb, false);
        EZpvd((InterfaceC56659yNo) interfaceC56658yNn, sb);
        if (!interfaceC56658yNn.DbNXlk().isSingleton() && AhwBna() && (interfaceC56656yNlUzCIH = interfaceC56658yNn.uzCIH()) != null) {
            sb.append(" ");
            renderAnnotations$default(this, sb, interfaceC56656yNlUzCIH, null, 2, null);
            yNC newProxyInstance2 = interfaceC56656yNlUzCIH.getNewProxyInstance();
            Intrinsics.checkNotNullExpressionValue(newProxyInstance2, "");
            AEQbTJ(newProxyInstance2, sb);
            sb.append(KWHzl("constructor"));
            java.util.List<InterfaceC56695yOx> listFetchVPNInfo = interfaceC56656yNlUzCIH.fetchVPNInfo();
            Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
            copydefault(listFetchVPNInfo, interfaceC56656yNlUzCIH.values(), sb);
        }
        OLrzqt(interfaceC56658yNn, sb);
        KWHzl(listAkhnZx, sb);
    }

    public final void OLrzqt(InterfaceC56658yNn interfaceC56658yNn, java.lang.StringBuilder sb) {
        if (fFgQHt() || AbstractC56640yMw.valueOf(interfaceC56658yNn.bQ_())) {
            return;
        }
        java.util.Collection<AbstractC59233zdF> collectionBV_ = interfaceC56658yNn.fJNWhG().bV_();
        Intrinsics.checkNotNullExpressionValue(collectionBV_, "");
        if (collectionBV_.isEmpty()) {
            return;
        }
        if (collectionBV_.size() == 1 && AbstractC56640yMw.KWHzl(collectionBV_.iterator().next())) {
            return;
        }
        KWHzl(sb);
        sb.append(": ");
        CollectionsKt___CollectionsKt.joinTo$default(collectionBV_, sb, ", ", null, null, 0, null, new C56957yYp(this), 60, null);
    }

    public static final java.lang.CharSequence KWHzl(C56949yYh c56949yYh, AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.copydefault(abstractC59233zdF);
        return c56949yYh.KWHzl(abstractC59233zdF);
    }

    public final void EZpvd(InterfaceC56658yNn interfaceC56658yNn, java.lang.StringBuilder sb) {
        sb.append(KWHzl(yXX.AEQbTJ.EZpvd(interfaceC56658yNn)));
    }

    public final void AEQbTJ(yNY yny, java.lang.StringBuilder sb) {
        AEQbTJ(yny.KWHzl(), "package", sb);
        if (djBIcL()) {
            sb.append(" in context of ");
            AEQbTJ((InterfaceC56665yNu) yny.djBIcL(), sb, false);
        }
    }

    public final void AEQbTJ(yNW ynw, java.lang.StringBuilder sb) {
        AEQbTJ(ynw.KWHzl(), "package-fragment", sb);
        if (djBIcL()) {
            sb.append(" in ");
            AEQbTJ((InterfaceC56665yNu) ynw.AuCTel(), sb, false);
        }
    }

    public final void AEQbTJ(C56933yXs c56933yXs, java.lang.String str, java.lang.StringBuilder sb) {
        sb.append(KWHzl(str));
        java.lang.String strCopydefault = copydefault(c56933yXs.AYXKKw());
        if (strCopydefault.length() > 0) {
            sb.append(" ");
            sb.append(strCopydefault);
        }
    }

    public final void OLrzqt(InterfaceC56677yOf interfaceC56677yOf, java.lang.StringBuilder sb) {
        copydefault((yNJ) interfaceC56677yOf, sb);
    }

    /* JADX INFO: renamed from: o.yYh$Activity */
    public final class Activity implements InterfaceC56667yNw<Unit, java.lang.StringBuilder> {

        /* JADX INFO: renamed from: o.yYh$Activity$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yNG, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit AEQbTJ(yNG yng, java.lang.StringBuilder sb) {
            OLrzqt(yng, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yNY, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit AEQbTJ(yNY yny, java.lang.StringBuilder sb) {
            copydefault(yny, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yOd, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit AEQbTJ(InterfaceC56675yOd interfaceC56675yOd, java.lang.StringBuilder sb) {
            copydefault(interfaceC56675yOd, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yOe, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit AEQbTJ(InterfaceC56676yOe interfaceC56676yOe, java.lang.StringBuilder sb) {
            EZpvd(interfaceC56676yOe, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yOt, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit AEQbTJ(InterfaceC56691yOt interfaceC56691yOt, java.lang.StringBuilder sb) {
            copydefault(interfaceC56691yOt, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yNW, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit EZpvd(yNW ynw, java.lang.StringBuilder sb) {
            AEQbTJ(ynw, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yNn, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit EZpvd(InterfaceC56658yNn interfaceC56658yNn, java.lang.StringBuilder sb) {
            AEQbTJ(interfaceC56658yNn, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yNp, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* bridge */ /* synthetic */ Unit EZpvd(InterfaceC56660yNp interfaceC56660yNp, java.lang.StringBuilder sb) {
            EZpvd2(interfaceC56660yNp, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yOh, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit EZpvd(InterfaceC56679yOh interfaceC56679yOh, java.lang.StringBuilder sb) {
            KWHzl(interfaceC56679yOh, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yOs, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit EZpvd(InterfaceC56690yOs interfaceC56690yOs, java.lang.StringBuilder sb) {
            OLrzqt(interfaceC56690yOs, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yOi, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit KWHzl(InterfaceC56680yOi interfaceC56680yOi, java.lang.StringBuilder sb) {
            OLrzqt(interfaceC56680yOi, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yOx, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit KWHzl(InterfaceC56695yOx interfaceC56695yOx, java.lang.StringBuilder sb) {
            EZpvd(interfaceC56695yOx, sb);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.yNP, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC56667yNw
        public /* synthetic */ Unit OLrzqt(yNP ynp, java.lang.StringBuilder sb) {
            AEQbTJ(ynp, sb);
            return Unit.INSTANCE;
        }

        public void EZpvd(@NotNull InterfaceC56695yOx interfaceC56695yOx, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(interfaceC56695yOx, "");
            Intrinsics.checkNotNullParameter(sb, "");
            C56949yYh.this.copydefault(interfaceC56695yOx, true, sb, true);
        }

        public void EZpvd(@NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
            Intrinsics.checkNotNullParameter(sb, "");
            C56949yYh.this.copydefault(interfaceC56676yOe, sb);
        }

        public void copydefault(@NotNull InterfaceC56675yOd interfaceC56675yOd, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(interfaceC56675yOd, "");
            Intrinsics.checkNotNullParameter(sb, "");
            EZpvd(interfaceC56675yOd, sb, "getter");
        }

        public void OLrzqt(@NotNull InterfaceC56680yOi interfaceC56680yOi, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(interfaceC56680yOi, "");
            Intrinsics.checkNotNullParameter(sb, "");
            EZpvd(interfaceC56680yOi, sb, "setter");
        }

        public final void EZpvd(InterfaceC56677yOf interfaceC56677yOf, java.lang.StringBuilder sb, java.lang.String str) {
            int i = TaskDescription.OLrzqt[C56949yYh.this.zLjUOn().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    OLrzqt(interfaceC56677yOf, sb);
                    return;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            C56949yYh.this.OLrzqt(interfaceC56677yOf, sb);
            sb.append(str + " for ");
            C56949yYh c56949yYh = C56949yYh.this;
            InterfaceC56676yOe interfaceC56676yOeFIwbmz = interfaceC56677yOf.fIwbmz();
            Intrinsics.checkNotNullExpressionValue(interfaceC56676yOeFIwbmz, "");
            c56949yYh.copydefault(interfaceC56676yOeFIwbmz, sb);
        }

        public void OLrzqt(@NotNull yNG yng, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(yng, "");
            Intrinsics.checkNotNullParameter(sb, "");
            C56949yYh.this.copydefault(yng, sb);
        }

        public void KWHzl(@NotNull InterfaceC56679yOh interfaceC56679yOh, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(interfaceC56679yOh, "");
            Intrinsics.checkNotNullParameter(sb, "");
            sb.append(interfaceC56679yOh.bR_());
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(@NotNull InterfaceC56660yNp interfaceC56660yNp, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(interfaceC56660yNp, "");
            Intrinsics.checkNotNullParameter(sb, "");
            C56949yYh.this.AEQbTJ(interfaceC56660yNp, sb);
        }

        public void copydefault(@NotNull InterfaceC56691yOt interfaceC56691yOt, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
            Intrinsics.checkNotNullParameter(sb, "");
            C56949yYh.this.OLrzqt(interfaceC56691yOt, sb, true);
        }

        public void AEQbTJ(@NotNull yNW ynw, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(ynw, "");
            Intrinsics.checkNotNullParameter(sb, "");
            C56949yYh.this.AEQbTJ(ynw, sb);
        }

        public void copydefault(@NotNull yNY yny, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(yny, "");
            Intrinsics.checkNotNullParameter(sb, "");
            C56949yYh.this.AEQbTJ(yny, sb);
        }

        public void AEQbTJ(@NotNull yNP ynp, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(ynp, "");
            Intrinsics.checkNotNullParameter(sb, "");
            C56949yYh.this.AEQbTJ((InterfaceC56665yNu) ynp, sb, true);
        }

        public void AEQbTJ(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            Intrinsics.checkNotNullParameter(sb, "");
            C56949yYh.this.KWHzl(interfaceC56658yNn, sb);
        }

        public void OLrzqt(@NotNull InterfaceC56690yOs interfaceC56690yOs, @NotNull java.lang.StringBuilder sb) {
            Intrinsics.checkNotNullParameter(interfaceC56690yOs, "");
            Intrinsics.checkNotNullParameter(sb, "");
            C56949yYh.this.KWHzl(interfaceC56690yOs, sb);
        }
    }

    public final void KWHzl(java.lang.StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public final boolean OLrzqt(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.valueOf().isEmpty();
    }

    public final void KWHzl(java.lang.StringBuilder sb, C59186zcL c59186zcL) {
        RenderingFormat renderingFormatRJOkX = RJOkX();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (renderingFormatRJOkX == renderingFormat) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* ");
        sb.append("from: ");
        copydefault(sb, (AbstractC59233zdF) c59186zcL.valueOf());
        sb.append(" */");
        if (RJOkX() == renderingFormat) {
            sb.append("</i></font>");
        }
    }

    public final void OLrzqt(java.lang.StringBuilder sb, C59186zcL c59186zcL) {
        RenderingFormat renderingFormatRJOkX = RJOkX();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (renderingFormatRJOkX == renderingFormat) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* ");
        sb.append("= ");
        copydefault(sb, (AbstractC59233zdF) c59186zcL.gEmmrt());
        sb.append(" */");
        if (RJOkX() == renderingFormat) {
            sb.append("</i></font>");
        }
    }
}
