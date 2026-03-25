package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33247msp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mqC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33102mqC {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl(int i) {
        if (i == 1) {
            return "pro_home_mode";
        }
        if (i != 2) {
            if (i == 3) {
                return "on_chain_mode";
            }
            if (i == 5) {
                return "pro_pay_home_mode";
            }
        }
        return "lite_home_mode";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int OLrzqt(@NotNull java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case 658745831:
                return !str.equals("exchange_home_mode") ? 2 : 1;
            case 1307638810:
                if (str.equals("pro_pay_home_mode")) {
                    return 5;
                }
                break;
            case 2065115633:
                if (!str.equals("pro_home_mode")) {
                }
                break;
            case 2106022578:
                str2 = "lite_home_mode";
                str.equals(str2);
            case 2115658433:
                if (str.equals("on_chain_mode")) {
                    return 3;
                }
                break;
            case 2118004995:
                str2 = "home_mode";
                str.equals(str2);
        }
    }

    public static final java.lang.String copydefault(@NotNull AbstractC33247msp abstractC33247msp) {
        Intrinsics.checkNotNullParameter(abstractC33247msp, "");
        return Intrinsics.EZpvd(abstractC33247msp, AbstractC33247msp.Activity.AEQbTJ) ? "pro_home_mode" : Intrinsics.EZpvd(abstractC33247msp, AbstractC33247msp.TaskDescription.AEQbTJ) ? "on_chain_mode" : (!Intrinsics.EZpvd(abstractC33247msp, AbstractC33247msp.StateListAnimator.AEQbTJ) && Intrinsics.EZpvd(abstractC33247msp, AbstractC33247msp.Application.AEQbTJ)) ? "pro_pay_home_mode" : "lite_home_mode";
    }

    public static final java.lang.String copydefault(@NotNull AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        return copydefault(abstractC33244msm.KWHzl());
    }
}
