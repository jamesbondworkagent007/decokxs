package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC33249msr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33405mvo {
    public static final C33405mvo KWHzl = new C33405mvo();

    private C33405mvo() {
    }

    public final void AEQbTJ(final AbstractC33249msr abstractC33249msr, final AbstractC33249msr abstractC33249msr2, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("HomePage_AppMode_Navigator_Click", (TrackChannel[]) null, new Function1() { // from class: o.mvk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33405mvo.EZpvd(abstractC33249msr2, abstractC33249msr, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(AbstractC33249msr abstractC33249msr, AbstractC33249msr abstractC33249msr2, java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String str2;
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC33249msr.TaskDescription taskDescription = AbstractC33249msr.TaskDescription.KWHzl;
        if (Intrinsics.EZpvd(abstractC33249msr, taskDescription)) {
            str2 = "exchange";
        } else if (Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.Application.AEQbTJ)) {
            str2 = "pay";
        } else {
            str2 = Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.ActionBar.EZpvd) ? "wallet" : "";
        }
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str2, false, 4, null);
        if (Intrinsics.EZpvd(abstractC33249msr2, taskDescription)) {
            str3 = "exchange";
        } else if (Intrinsics.EZpvd(abstractC33249msr2, AbstractC33249msr.Application.AEQbTJ)) {
            str3 = "pay";
        } else {
            str3 = Intrinsics.EZpvd(abstractC33249msr2, AbstractC33249msr.ActionBar.EZpvd) ? "wallet" : "";
        }
        EventParamsList.put$default(eventParamsList, "sub_mode", str3, false, 4, null);
        if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) "home", true)) {
            str = "top_nav";
        }
        EventParamsList.put$default(eventParamsList, "page", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("HomePage_AppMode_Navigator_Chip_Click", (TrackChannel[]) null, new Function1() { // from class: o.mvl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33405mvo.KWHzl(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "page", str2, false, 4, null);
        return Unit.INSTANCE;
    }
}
