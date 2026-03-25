package com.okinc.business.dex.trade.copytrading.edit.ui.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ibm.icu.text.DateFormat;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C56444yFp;
import o.C59449zhJ;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class TokenAgeUnit implements RangeFilterUnit {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenAgeUnit[] $VALUES;
    public static final Parcelable.Creator<TokenAgeUnit> CREATOR;
    public static final Activity Companion;
    private final long scale;
    private final int textResId;
    private final String unitValue;
    public static final TokenAgeUnit Sec = new TokenAgeUnit("Sec", 0, DateFormat.SECOND, TimeUnit.SECONDS.toSeconds(1), C23274hvD.Fragment.OzhFjl);
    public static final TokenAgeUnit Min = new TokenAgeUnit("Min", 1, DateFormat.MINUTE, TimeUnit.MINUTES.toSeconds(1), C23274hvD.Fragment.aQtmcU);
    public static final TokenAgeUnit Hour = new TokenAgeUnit("Hour", 2, "h", TimeUnit.HOURS.toSeconds(1), C23274hvD.Fragment.OAhWiU);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenAgeUnit[] $values() {
        return new TokenAgeUnit[]{Sec, Min, Hour};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenAgeUnit> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit
    public long getScale() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit
    public String getUnitValue() {
        return this.unitValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private TokenAgeUnit(String str, int i, String str2, long j, int i2) {
        this.unitValue = str2;
        this.scale = j;
        this.textResId = i2;
    }

    static {
        TokenAgeUnit[] tokenAgeUnitArr$values = $values();
        $VALUES = tokenAgeUnitArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenAgeUnitArr$values);
        Companion = new Activity(null);
        CREATOR = new Parcelable.Creator<TokenAgeUnit>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.model.TokenAgeUnit.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenAgeUnit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TokenAgeUnit.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenAgeUnit[] newArray(int i) {
                return new TokenAgeUnit[i];
            }
        };
    }

    @Override // com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit
    public String getText(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(this.textResId);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.ui.model.TokenAgeUnit.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TokenAgeUnit OLrzqt(@NotNull String str) {
            TokenAgeUnit next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<TokenAgeUnit> it = TokenAgeUnit.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C59449zhJ.gEmmrt(next.getUnitValue(), str, true)) {
                    break;
                }
            }
            TokenAgeUnit tokenAgeUnit = next;
            return tokenAgeUnit == null ? TokenAgeUnit.Sec : tokenAgeUnit;
        }
    }

    public static TokenAgeUnit valueOf(String str) {
        return (TokenAgeUnit) Enum.valueOf(TokenAgeUnit.class, str);
    }

    public static TokenAgeUnit[] values() {
        return (TokenAgeUnit[]) $VALUES.clone();
    }
}
