package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.di.LocalizeDIModule;
import com.okinc.localization.util.format.DisplaySign;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rjt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43154rjt {
    public static final C43154rjt OLrzqt = new C43154rjt();
    public static final pTU KWHzl = ((LocalizeDIModule.Activity) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Activity.class)).gkJEwt();
    public static final int copydefault = 8;

    private C43154rjt() {
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.addS$default(str, str2, null, null, null, 14, null);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.subS$default(str, str2, null, null, null, 14, null);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.mulS$default(str, str2, null, null, null, 14, null);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.divS$default(str, str2, null, null, null, 14, null);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(i), java.lang.Boolean.FALSE, KWHzl(i3));
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, int i2, int i3, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        return pTB.formatICUCompact$default(C33129mqd.EZpvd(str), KWHzl(C33129mqd.AhwBna(java.lang.Integer.valueOf(i))), C38307pTy.Companion.KWHzl(C33129mqd.AhwBna(java.lang.Integer.valueOf(i2)), C33129mqd.AhwBna(java.lang.Integer.valueOf(i3))), displaySign, null, 8, null);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(str2)), java.lang.Boolean.valueOf(i == 1), KWHzl(C33129mqd.AhwBna(str3)));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.toLocalizationStringWithPrecision$default(str, i2, i, KWHzl(i3), null, 8, null);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatLocalized$default(str, null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
    
        if (r3.equals("en") == false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OLrzqt() {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) KWHzl.OLrzqt().getLanguageCode(), new char[]{'-'}, false, 0, 6, (java.lang.Object) null);
        if ((listSplit$default == null || listSplit$default.isEmpty()) && listSplit$default.size() >= 2) {
            return 0;
        }
        java.lang.String str = (java.lang.String) listSplit$default.get(0);
        java.lang.String str2 = (java.lang.String) listSplit$default.get(1);
        int iHashCode = str.hashCode();
        if (iHashCode != 3241) {
            if (iHashCode != 3365) {
                if (iHashCode != 3428) {
                    if (iHashCode != 3651) {
                        if (iHashCode != 3700) {
                            if (iHashCode != 3710) {
                                if (iHashCode != 3763) {
                                    if (iHashCode == 3886 && str.equals("zh")) {
                                        if (str2.length() != 0) {
                                            return 1;
                                        }
                                        return 2;
                                    }
                                } else if (str.equals("vi")) {
                                    return 3;
                                }
                            } else if (str.equals("tr")) {
                                return 8;
                            }
                        } else if (str.equals("th")) {
                            return 6;
                        }
                    } else if (str.equals("ru")) {
                        return 7;
                    }
                } else if (str.equals("ko")) {
                    return 5;
                }
            } else if (str.equals("in")) {
                return 4;
            }
            return 0;
        }
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) str), KWHzl(i), C38307pTy.Companion.KWHzl(i2, i3), EZpvd(i4), java.lang.Double.valueOf(100.0d), null, 16, null);
    }

    public final RoundingMode KWHzl(int i) {
        if (i == 0) {
            return RoundingMode.HALF_UP;
        }
        if (i == 1) {
            return RoundingMode.DOWN;
        }
        if (i == 2) {
            return RoundingMode.UP;
        }
        return RoundingMode.HALF_UP;
    }

    public final DisplaySign EZpvd(int i) {
        if (i == 0) {
            return DisplaySign.AUTO;
        }
        if (i == 1) {
            return DisplaySign.EXCEPT_ZERO;
        }
        return DisplaySign.AUTO;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull final java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C33495mxY.OLrzqt("paramsEvent2", map.toString());
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rjs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43154rjt.AEQbTJ(map, (EventParamsList) obj);
            }
        });
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.util.HashMap map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        for (Map.Entry entry : map.entrySet()) {
            java.lang.Object obj = ((java.util.HashMap) entry.getValue()).get("type");
            Intrinsics.copydefault(obj, "");
            int iIntValue = ((java.lang.Integer) obj).intValue();
            eventParamsList.add(new EventParam(java.lang.String.valueOf(((java.util.HashMap) entry.getValue()).get(JwtUtilsKt.DID_METHOD_KEY)), java.lang.String.valueOf(((java.util.HashMap) entry.getValue()).get("value")), iIntValue == 0));
        }
        return Unit.INSTANCE;
    }
}
