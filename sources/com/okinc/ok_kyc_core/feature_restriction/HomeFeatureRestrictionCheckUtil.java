package com.okinc.ok_kyc_core.feature_restriction;

import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.ok_kyc_core.feature_restriction.HomeFeatureRestrictionCheckUtil;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C32868mlh;
import o.C43251rlk;
import o.C56444yFp;
import o.InterfaceC33171mrS;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class HomeFeatureRestrictionCheckUtil {
    public static final HomeFeatureRestrictionCheckUtil AEQbTJ = new HomeFeatureRestrictionCheckUtil();

    private HomeFeatureRestrictionCheckUtil() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DialogType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DialogType[] $VALUES;
        public static final DialogType REGISTER_FORBIDDEN = new DialogType("REGISTER_FORBIDDEN", 0);
        public static final DialogType CEFI_FORBIDDEN = new DialogType("CEFI_FORBIDDEN", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DialogType[] $values() {
            return new DialogType[]{REGISTER_FORBIDDEN, CEFI_FORBIDDEN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DialogType> getEntries() {
            return $ENTRIES;
        }

        private DialogType(String str, int i) {
        }

        static {
            DialogType[] dialogTypeArr$values = $values();
            $VALUES = dialogTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(dialogTypeArr$values);
        }

        public static DialogType valueOf(String str) {
            return (DialogType) Enum.valueOf(DialogType.class, str);
        }

        public static DialogType[] values() {
            return (DialogType[]) $VALUES.clone();
        }
    }

    public final void EZpvd(@NotNull String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ(str, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rCv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return HomeFeatureRestrictionCheckUtil.AEQbTJ(z, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("checkbox_do_not_show", z ? "yes" : "no", true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        InterfaceC33171mrS.Activity.switchToAppMode$default((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), fragmentActivity, 3, true, 0, null, null, 48, null);
    }
}
