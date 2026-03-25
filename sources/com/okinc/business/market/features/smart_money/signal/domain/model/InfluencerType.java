package com.okinc.business.market.features.smart_money.signal.domain.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.C56403yEb;
import o.C56444yFp;
import o.C57406yhn;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class InfluencerType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InfluencerType[] $VALUES;
    public static final TaskDescription Companion;
    private final int drawableRes;
    private final String eventTrackingKey;
    private final int stringRes;
    private final String value;
    public static final InfluencerType SMART_MONEY = new InfluencerType("SMART_MONEY", 0, "1", C23274hvD.Fragment.gGvvIC, C52761wXj.TaskDescription.hijVBL, "smart_money");
    public static final InfluencerType KOLs = new InfluencerType("KOLs", 1, "2", C23274hvD.Fragment.gasjUx, C57406yhn.Activity.ejfBZ, "kol");
    public static final InfluencerType WHALES = new InfluencerType("WHALES", 2, "3", C23274hvD.Fragment.fvQaOB, C57406yhn.Activity.zuBGHE, "whales");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InfluencerType[] $values() {
        return new InfluencerType[]{SMART_MONEY, KOLs, WHALES};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InfluencerType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDrawableRes() {
        return this.drawableRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventTrackingKey() {
        return this.eventTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStringRes() {
        return this.stringRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private InfluencerType(String str, @StringRes int i, @DrawableRes String str2, int i2, int i3, String str3) {
        this.value = str2;
        this.stringRes = i2;
        this.drawableRes = i3;
        this.eventTrackingKey = str3;
    }

    static {
        InfluencerType[] influencerTypeArr$values = $values();
        $VALUES = influencerTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(influencerTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final InfluencerType AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            InfluencerType influencerType = InfluencerType.KOLs;
            if (Intrinsics.EZpvd((Object) str, (Object) influencerType.getValue())) {
                return influencerType;
            }
            InfluencerType influencerType2 = InfluencerType.WHALES;
            return Intrinsics.EZpvd((Object) str, (Object) influencerType2.getValue()) ? influencerType2 : InfluencerType.SMART_MONEY;
        }

        public static final CharSequence AEQbTJ(InfluencerType influencerType) {
            Intrinsics.checkNotNullParameter(influencerType, "");
            return influencerType.getEventTrackingKey();
        }

        public final String AEQbTJ(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(InfluencerType.Companion.AEQbTJ((String) it.next()));
            }
            return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: o.kuB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InfluencerType.TaskDescription.AEQbTJ((InfluencerType) obj);
                }
            }, 30, null);
        }
    }

    public static InfluencerType valueOf(String str) {
        return (InfluencerType) Enum.valueOf(InfluencerType.class, str);
    }

    public static InfluencerType[] values() {
        return (InfluencerType[]) $VALUES.clone();
    }
}
