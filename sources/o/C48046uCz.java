package o;

import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.ParamSpecUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.ParamType;
import com.okinc.tradingbot.impl.aiBot.dto.IndicatorCategoryDto;
import com.okinc.tradingbot.impl.aiBot.dto.IndicatorDto;
import com.okinc.tradingbot.impl.aiBot.dto.ParamSpecDto;
import com.okinc.tradingbot.impl.aiBot.dto.TechnicalIndicatorsResponseDto;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uCz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48046uCz {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.uCz$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ParamType.values().length];
            try {
                iArr[ParamType.DECIMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ParamType.INTEGER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public C48046uCz() {
    }

    /* JADX INFO: renamed from: o.uCz$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uCz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final java.util.List<IndicatorSectionUiModel> AEQbTJ(@NotNull TechnicalIndicatorsResponseDto technicalIndicatorsResponseDto) {
        Intrinsics.checkNotNullParameter(technicalIndicatorsResponseDto, "");
        java.util.List<IndicatorCategoryDto> listOLrzqt = technicalIndicatorsResponseDto.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((IndicatorCategoryDto) it.next()));
        }
        return arrayList;
    }

    public final IndicatorSectionUiModel copydefault(IndicatorCategoryDto indicatorCategoryDto) {
        java.lang.String strOLrzqt = indicatorCategoryDto.OLrzqt();
        java.util.List<IndicatorDto> listAEQbTJ = indicatorCategoryDto.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (IndicatorDto indicatorDto : listAEQbTJ) {
            arrayList.add(AEQbTJ(indicatorDto, OLrzqt(indicatorCategoryDto.OLrzqt(), indicatorDto.copydefault())));
        }
        return new IndicatorSectionUiModel(strOLrzqt, arrayList);
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        return str + "_" + str2;
    }

    public final Indicator AEQbTJ(IndicatorDto indicatorDto, java.lang.String str) {
        java.util.List<ParamSpecDto> listAEQbTJ = indicatorDto.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((ParamSpecDto) it.next()));
        }
        ParamSpecUiModel paramSpecUiModel = (ParamSpecUiModel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (paramSpecUiModel != null && paramSpecUiModel.AEQbTJ()) {
            return new Indicator.MultiValue(str, indicatorDto.copydefault(), indicatorDto.EZpvd(), indicatorDto.KWHzl(), arrayList, false, OLrzqt(arrayList), 32, null);
        }
        if (!arrayList.isEmpty()) {
            return new Indicator.FixedParams(str, indicatorDto.copydefault(), indicatorDto.EZpvd(), indicatorDto.KWHzl(), arrayList, false, KWHzl(arrayList), 32, null);
        }
        return new Indicator.NoParams(str, indicatorDto.copydefault(), indicatorDto.EZpvd(), indicatorDto.KWHzl(), arrayList, false, 32, null);
    }

    public final java.util.List<java.lang.Integer> OLrzqt(java.util.List<ParamSpecUiModel> list) {
        ParamSpecUiModel paramSpecUiModel = (ParamSpecUiModel) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (paramSpecUiModel != null && paramSpecUiModel.copydefault() != null) {
            return C56402yEa.EZpvd(java.lang.Integer.valueOf(C33129mqd.AhwBna(paramSpecUiModel.copydefault())));
        }
        return yDY.AhwBna();
    }

    public final ParamSpecUiModel EZpvd(ParamSpecDto paramSpecDto) {
        java.lang.String lowerCase = paramSpecDto.djBIcL().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return new ParamSpecUiModel(paramSpecDto.OLrzqt(), Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "decimal") ? ParamType.DECIMAL : ParamType.INTEGER, paramSpecDto.AYXKKw(), paramSpecDto.valueOf(), paramSpecDto.gEmmrt(), paramSpecDto.KWHzl(), paramSpecDto.copydefault(), paramSpecDto.EZpvd(), paramSpecDto.AhwBna());
    }

    public final java.util.List<java.lang.Number> KWHzl(java.util.List<ParamSpecUiModel> list) {
        java.lang.Object objValueOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ParamSpecUiModel paramSpecUiModel : list) {
            java.lang.Double dCopydefault = paramSpecUiModel.copydefault();
            if (dCopydefault != null) {
                double dDoubleValue = dCopydefault.doubleValue();
                int i = StateListAnimator.copydefault[paramSpecUiModel.gEmmrt().ordinal()];
                if (i == 1) {
                    objValueOf = java.lang.Double.valueOf(dDoubleValue);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objValueOf = java.lang.Integer.valueOf(C33129mqd.AhwBna(java.lang.Double.valueOf(dDoubleValue)));
                }
            } else {
                objValueOf = null;
            }
            if (objValueOf != null) {
                arrayList.add(objValueOf);
            }
        }
        return arrayList;
    }
}
