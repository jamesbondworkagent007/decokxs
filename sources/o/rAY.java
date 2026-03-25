package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.AssetDetail;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AssetValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputNumberAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Rule;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rAY {
    public static final rAY AEQbTJ = new rAY();

    private rAY() {
    }

    public final C41966rBj EZpvd(java.lang.Object obj) {
        boolean z = obj != null;
        return new C41966rBj(z, null, z ? null : "Should not be empty", 2, null);
    }

    public final C41966rBj AEQbTJ(java.lang.String str) {
        java.lang.Boolean boolValueOf;
        if (str != null) {
            boolValueOf = java.lang.Boolean.valueOf(str.length() > 0);
        } else {
            boolValueOf = null;
        }
        boolean z = boolValueOf == null || Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.FALSE);
        return new C41966rBj(!z, null, z ? "Should not be empty" : null, 2, null);
    }

    public final C41966rBj EZpvd(java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
            return new C41966rBj(false, null, "please check the consent", 2, null);
        }
        return new C41966rBj(true, null, null, 2, null);
    }

    public final C41966rBj OLrzqt(AssetValue assetValue) {
        if (assetValue != null) {
            if (C33129mqd.gEmmrt(assetValue.getCurrent(), assetValue.getTotal())) {
                return new C41966rBj(false, null, null, 6, null);
            }
            java.util.Iterator<T> it = assetValue.getAssetList().iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((AssetDetail) it.next()).getStatus(), (java.lang.Object) "3")) {
                    return new C41966rBj(false, null, null, 2, null);
                }
            }
        }
        return new C41966rBj(true, null, null, 2, null);
    }

    public final C41966rBj EZpvd(PairInputValue pairInputValue, @NotNull PairInputNumberAppModel pairInputNumberAppModel) {
        java.lang.String subInputValue;
        Intrinsics.checkNotNullParameter(pairInputNumberAppModel, "");
        if (pairInputValue != null) {
            rAY ray = AEQbTJ;
            java.lang.String inputValue = pairInputValue.getInputValue();
            SubInput input = pairInputNumberAppModel.getInput();
            C41966rBj c41966rBjKWHzl = ray.KWHzl(inputValue, input != null ? input.getRules() : null);
            if (pairInputNumberAppModel.getSubInput() == null) {
                java.lang.String inputValue2 = pairInputValue.getInputValue();
                return (inputValue2 == null || inputValue2.length() == 0) ? new C41966rBj(false, null, null, 6, null) : c41966rBjKWHzl;
            }
            java.lang.String inputValue3 = pairInputValue.getInputValue();
            if ((inputValue3 == null || inputValue3.length() == 0) && ((subInputValue = pairInputValue.getSubInputValue()) == null || subInputValue.length() == 0)) {
                return new C41966rBj(false, null, null, 6, null);
            }
            java.lang.String subInputValue2 = pairInputValue.getSubInputValue();
            SubInput subInput = pairInputNumberAppModel.getSubInput();
            C41966rBj c41966rBjKWHzl2 = ray.KWHzl(subInputValue2, subInput != null ? subInput.getRules() : null);
            if (!c41966rBjKWHzl.OLrzqt() || !c41966rBjKWHzl2.OLrzqt()) {
                return new C41966rBj(false, null, null, 6, null);
            }
        }
        return new C41966rBj(true, null, null, 2, null);
    }

    public final C41966rBj EZpvd(InputDateRangeValue inputDateRangeValue) {
        if (inputDateRangeValue != null) {
            if (inputDateRangeValue.getStart() == null) {
                return new C41966rBj(false, null, null, 6, null);
            }
            if (!inputDateRangeValue.getToPresent() && inputDateRangeValue.getEnd() == null) {
                return new C41966rBj(false, null, null, 6, null);
            }
        }
        return new C41966rBj(true, null, null, 2, null);
    }

    public final C41966rBj copydefault(Value value) {
        if (value != null) {
            if (Intrinsics.EZpvd(value.isValid(), java.lang.Boolean.FALSE)) {
                return new C41966rBj(false, null, null, 2, null);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) value.getValue())) {
                SubInput subInput = value.getSubInput();
                if (subInput != null) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) subInput.getValue())) {
                        if (Intrinsics.EZpvd(subInput.isNumber(), java.lang.Boolean.TRUE)) {
                            return AEQbTJ.KWHzl(subInput.getValue(), subInput.getRules());
                        }
                        return AEQbTJ.OLrzqt(subInput.getValue(), subInput.getRules());
                    }
                    return new C41966rBj(!Intrinsics.EZpvd(subInput.getRequired(), java.lang.Boolean.TRUE), null, null, 2, null);
                }
                return new C41966rBj(true, null, null, 2, null);
            }
            return new C41966rBj(false, null, null, 2, null);
        }
        return new C41966rBj(true, null, null, 2, null);
    }

    public final C41966rBj AEQbTJ(java.util.List<java.lang.String> list, int i) {
        if (list != null && list.size() > i) {
            return new C41966rBj(false, null, null, 2, null);
        }
        return new C41966rBj(true, null, null, 2, null);
    }

    public final C41966rBj OLrzqt(java.util.List<?> list) {
        java.lang.Boolean boolValueOf = list != null ? java.lang.Boolean.valueOf(list.isEmpty()) : null;
        boolean z = boolValueOf == null || Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE);
        return new C41966rBj(!z, null, z ? "Should not be empty" : null, 2, null);
    }

    public final C41966rBj OLrzqt(java.util.List<FieldDisplay> list, int i) {
        if (list != null) {
            if (list.size() < i) {
                return new C41966rBj(false, null, null, 2, null);
            }
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((FieldDisplay) it.next()).getStatus(), (java.lang.Object) "3")) {
                    return new C41966rBj(false, null, null, 2, null);
                }
            }
            java.util.Iterator<FieldDisplay> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.EZpvd((java.lang.Object) it2.next().getStatus(), (java.lang.Object) "4")) {
                }
            }
            return new C41966rBj(false, null, null, 2, null);
        }
        return new C41966rBj(true, null, null, 2, null);
    }

    public final C41966rBj copydefault(Date date, java.util.List<Rule> list) {
        if (date != null && list != null) {
            for (Rule rule : list) {
                java.lang.Long min = rule.getMin();
                if (min != null && min.longValue() > date.getTime()) {
                    return new C41966rBj(false, null, rule.getMessage(), 2, null);
                }
                java.lang.Long max = rule.getMax();
                if (max != null) {
                    if (date.getTime() >= max.longValue()) {
                        return new C41966rBj(false, null, rule.getMessage(), 2, null);
                    }
                }
            }
        }
        return new C41966rBj(true, null, null, 2, null);
    }

    public final C41966rBj OLrzqt(java.lang.String str, java.util.List<Rule> list) {
        if (str != null && list != null) {
            for (Rule rule : list) {
                java.lang.Long min = rule.getMin();
                if (min != null) {
                    if (str.length() < min.longValue()) {
                        return new C41966rBj(false, null, rule.getMessage(), 2, null);
                    }
                }
                java.lang.Long max = rule.getMax();
                if (max != null) {
                    if (str.length() > max.longValue() - 1) {
                        return new C41966rBj(false, null, rule.getMessage(), 2, null);
                    }
                }
                java.lang.String pattern = rule.getPattern();
                if (pattern != null && !new Regex(pattern).matches(str)) {
                    return new C41966rBj(false, null, rule.getMessage(), 2, null);
                }
            }
        }
        return new C41966rBj(true, null, null, 2, null);
    }

    public final C41966rBj KWHzl(java.lang.String str, java.util.List<Rule> list) {
        if (str != null && list != null) {
            for (Rule rule : list) {
                java.lang.Long min = rule.getMin();
                if (min != null && C33129mqd.valueOf(str, java.lang.Long.valueOf(min.longValue()))) {
                    return new C41966rBj(false, null, rule.getMessage(), 2, null);
                }
                java.lang.Long max = rule.getMax();
                if (max != null && C33129mqd.AEQbTJ(str, java.lang.Long.valueOf(max.longValue()))) {
                    return new C41966rBj(false, null, rule.getMessage(), 2, null);
                }
            }
        }
        return new C41966rBj(true, null, null, 2, null);
    }

    public final C41966rBj copydefault(java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File> list) {
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((com.okinc.ok_kyc_core.data.remote.networkmodel.File) it.next()).getImageId() == 0) {
                    return new C41966rBj(false, null, null, 2, null);
                }
            }
        }
        return new C41966rBj(true, null, null, 2, null);
    }
}
