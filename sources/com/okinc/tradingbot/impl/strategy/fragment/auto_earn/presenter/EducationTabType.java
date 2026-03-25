package com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C48033uCm;
import o.C54061wxJ;
import o.C54065wxN;
import o.C54131wya;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC47982uAp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public abstract class EducationTabType implements InterfaceC47982uAp, Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EducationTabType[] $VALUES;
    public static final Parcelable.Creator<EducationTabType> CREATOR;
    public static final Application Companion;
    private final String type;
    public static final EducationTabType AUTO_EARN_BENEFIT = new EducationTabType("AUTO_EARN_BENEFIT", 0) { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType.AUTO_EARN_BENEFIT
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            String str = "autoEarnBenefit";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX DEBUG: Method merged with bridge method: getFragment(Ljava/lang/Object;)Landroidx/fragment/app/Fragment; */
        @Override // o.InterfaceC47982uAp
        public C54065wxN getFragment(Object obj) {
            return C54065wxN.Companion.EZpvd(true);
        }
    };
    public static final EducationTabType AUTO_EARN_FAQ = new EducationTabType("AUTO_EARN_FAQ", 1) { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType.AUTO_EARN_FAQ
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            String str = "autoEarnFaq";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX DEBUG: Method merged with bridge method: getFragment(Ljava/lang/Object;)Landroidx/fragment/app/Fragment; */
        @Override // o.InterfaceC47982uAp
        public C54131wya getFragment(Object obj) {
            return C54131wya.Companion.KWHzl(true);
        }
    };
    public static final EducationTabType AUTO_STAKING_BENEFIT = new EducationTabType("AUTO_STAKING_BENEFIT", 2) { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType.AUTO_STAKING_BENEFIT
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            String str = "autoStakingBenefit";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX DEBUG: Method merged with bridge method: getFragment(Ljava/lang/Object;)Landroidx/fragment/app/Fragment; */
        @Override // o.InterfaceC47982uAp
        public C54065wxN getFragment(Object obj) {
            return C54065wxN.Companion.EZpvd(false);
        }
    };
    public static final EducationTabType AUTO_STAKING_FAQ = new EducationTabType("AUTO_STAKING_FAQ", 3) { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType.AUTO_STAKING_FAQ
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            String str = "autoStakingFaq";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        /* JADX DEBUG: Method merged with bridge method: getFragment(Ljava/lang/Object;)Landroidx/fragment/app/Fragment; */
        @Override // o.InterfaceC47982uAp
        public C54131wya getFragment(Object obj) {
            return C54131wya.Companion.KWHzl(false);
        }
    };
    public static final EducationTabType AUTO_EARN = new EducationTabType("AUTO_EARN", 4) { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType.AUTO_EARN
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            String str = "autoEarn";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            String string;
            C54061wxJ.Application application = C54061wxJ.Companion;
            C54061wxJ c54061wxJKWHzl = application.KWHzl("auto_education_single_earn");
            Bundle bundle = new Bundle();
            String strAEQbTJ = application.AEQbTJ();
            Bundle arguments = c54061wxJKWHzl.getArguments();
            if (arguments == null || (string = arguments.getString(application.AEQbTJ())) == null) {
                string = "";
            }
            bundle.putString(strAEQbTJ, string);
            Intrinsics.copydefault(obj, "");
            Object second = ((Pair) obj).getSecond();
            Intrinsics.copydefault(second, "");
            bundle.putAll((Bundle) second);
            c54061wxJKWHzl.setArguments(bundle);
            return c54061wxJKWHzl;
        }
    };
    public static final EducationTabType AUTO_STAKE = new EducationTabType("AUTO_STAKE", 5) { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType.AUTO_STAKE
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        {
            String str = "autoStake";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // o.InterfaceC47982uAp
        public Fragment getFragment(Object obj) {
            String string;
            C54061wxJ.Application application = C54061wxJ.Companion;
            C54061wxJ c54061wxJKWHzl = application.KWHzl("auto_education_single_staking");
            Bundle bundle = new Bundle();
            String strAEQbTJ = application.AEQbTJ();
            Bundle arguments = c54061wxJKWHzl.getArguments();
            if (arguments == null || (string = arguments.getString(application.AEQbTJ())) == null) {
                string = "";
            }
            bundle.putString(strAEQbTJ, string);
            Intrinsics.copydefault(obj, "");
            Object second = ((Pair) obj).getSecond();
            Intrinsics.copydefault(second, "");
            bundle.putAll((Bundle) second);
            c54061wxJKWHzl.setArguments(bundle);
            return c54061wxJKWHzl;
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EducationTabType[] $values() {
        return new EducationTabType[]{AUTO_EARN_BENEFIT, AUTO_EARN_FAQ, AUTO_STAKING_BENEFIT, AUTO_STAKING_FAQ, AUTO_EARN, AUTO_STAKE};
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int), (r3v0 java.lang.String) A[MD:(java.lang.String, int, java.lang.String):void (m)] call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType.<init>(java.lang.String, int, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ EducationTabType(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EducationTabType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private EducationTabType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        EducationTabType[] educationTabTypeArr$values = $values();
        $VALUES = educationTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(educationTabTypeArr$values);
        Companion = new Application(null);
        CREATOR = new Parcelable.Creator<EducationTabType>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationTabType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return EducationTabType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EducationTabType[] newArray(int i) {
                return new EducationTabType[i];
            }
        };
    }

    public static final class Application {

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType$Application$Application, reason: collision with other inner class name */
        public final /* synthetic */ class C0672Application {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[EducationTabType.values().length];
                try {
                    iArr[EducationTabType.AUTO_EARN_BENEFIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EducationTabType.AUTO_STAKING_BENEFIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EducationTabType.AUTO_EARN_FAQ.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EducationTabType.AUTO_STAKING_FAQ.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EducationTabType.AUTO_EARN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EducationTabType.AUTO_STAKE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String copydefault(@NotNull EducationTabType educationTabType) {
            Intrinsics.checkNotNullParameter(educationTabType, "");
            switch (C0672Application.copydefault[educationTabType.ordinal()]) {
                case 1:
                case 2:
                    return C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplApi217);
                case 3:
                case 4:
                    return C33070mpX.AYXKKw(C48033uCm.Fragment.gwwzsY);
                case 5:
                    return C33070mpX.AYXKKw(C48033uCm.Fragment.aBDePw);
                case 6:
                    return C33070mpX.AYXKKw(C48033uCm.Fragment.UCQKYV);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static EducationTabType valueOf(String str) {
        return (EducationTabType) Enum.valueOf(EducationTabType.class, str);
    }

    public static EducationTabType[] values() {
        return (EducationTabType[]) $VALUES.clone();
    }
}
