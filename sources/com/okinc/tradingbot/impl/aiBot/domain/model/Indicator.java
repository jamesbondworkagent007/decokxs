package com.okinc.tradingbot.impl.aiBot.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56390yDp;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56548yJl;
import o.pTB;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface Indicator extends IndicatorBase {
    Map<String, Object> AEQbTJ();

    Indicator KWHzl(boolean z);

    String copydefault();

    public static final class MultiValue implements Indicator {
        public static final Parcelable.Creator<MultiValue> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;
        public final boolean KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final List<ParamSpecUiModel> djBIcL;
        public final List<Integer> gEmmrt;

        public static final class Creator implements Parcelable.Creator<MultiValue> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiValue createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ParamSpecUiModel.CREATOR.createFromParcel(parcel));
                }
                boolean z = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                return new MultiValue(string, string2, string3, string4, arrayList, z, arrayList2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiValue[] newArray(int i) {
                return new MultiValue[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.tradingbot.impl.aiBot.domain.model.Indicator$MultiValue */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultiValue copy$default(MultiValue multiValue, String str, String str2, String str3, String str4, List list, boolean z, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = multiValue.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = multiValue.EZpvd;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = multiValue.OLrzqt;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = multiValue.copydefault;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                list = multiValue.djBIcL;
            }
            List list3 = list;
            if ((i & 32) != 0) {
                z = multiValue.KWHzl;
            }
            boolean z2 = z;
            if ((i & 64) != 0) {
                list2 = multiValue.gEmmrt;
            }
            return multiValue.EZpvd(str, str5, str6, str7, list3, z2, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public List<ParamSpecUiModel> AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Integer> AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MultiValue EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<ParamSpecUiModel> list, boolean z, @NotNull List<Integer> list2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new MultiValue(str, str2, str3, str4, list, z, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String OLrzqt() {
            return this.copydefault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiValue)) {
                return false;
            }
            MultiValue multiValue = (MultiValue) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) multiValue.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) multiValue.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) multiValue.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) multiValue.copydefault) && Intrinsics.EZpvd(this.djBIcL, multiValue.djBIcL) && this.KWHzl == multiValue.KWHzl && Intrinsics.EZpvd(this.gEmmrt, multiValue.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public boolean gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + this.gEmmrt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MultiValue(id=" + this.AEQbTJ + ", name=" + this.EZpvd + ", longName=" + this.OLrzqt + ", description=" + this.copydefault + ", paramSpecs=" + this.djBIcL + ", isSelected=" + this.KWHzl + ", values=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.copydefault);
            List<ParamSpecUiModel> list = this.djBIcL;
            parcel.writeInt(list.size());
            Iterator<ParamSpecUiModel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            parcel.writeInt(this.KWHzl ? 1 : 0);
            List<Integer> list2 = this.gEmmrt;
            parcel.writeInt(list2.size());
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        }

        public MultiValue(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<ParamSpecUiModel> list, boolean z, @NotNull List<Integer> list2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.AEQbTJ = str;
            this.EZpvd = str2;
            this.OLrzqt = str3;
            this.copydefault = str4;
            this.djBIcL = list;
            this.KWHzl = z;
            this.gEmmrt = list2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:63)) : (r16v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.tradingbot.impl.aiBot.domain.model.ParamSpecUiModel>, boolean, java.util.List<java.lang.Integer>):void (m)] (LINE:56) call: com.okinc.tradingbot.impl.aiBot.domain.model.Indicator.MultiValue.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, java.util.List):void type: THIS */
        public /* synthetic */ MultiValue(String str, String str2, String str3, String str4, List list, boolean z, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, list, (i & 32) != 0 ? false : z, (i & 64) != 0 ? yDY.AhwBna() : list2);
        }

        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.Indicator
        public String copydefault() {
            if (gEmmrt() && (!this.gEmmrt.isEmpty())) {
                return CollectionsKt___CollectionsKt.joinToString$default(this.gEmmrt, ", ", null, null, 0, null, new Function1() { // from class: o.uCC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return Indicator.MultiValue.copydefault(((java.lang.Integer) obj).intValue());
                    }
                }, 30, null);
            }
            return null;
        }

        public static final CharSequence copydefault(int i) {
            return pTB.formatDownToMax$default(C33129mqd.EZpvd(Integer.valueOf(i)), 8, null, 2, null);
        }

        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.Indicator
        public Map<String, Object> AEQbTJ() {
            String strOLrzqt;
            ParamSpecUiModel paramSpecUiModel = (ParamSpecUiModel) CollectionsKt___CollectionsKt.firstOrNull(AYXKKw());
            if (paramSpecUiModel == null || (strOLrzqt = paramSpecUiModel.OLrzqt()) == null) {
                strOLrzqt = TypedValues.CycleType.S_WAVE_PERIOD;
            }
            return C56423yEv.EZpvd(C56390yDp.OLrzqt(strOLrzqt, this.gEmmrt));
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Z)Lcom/okinc/tradingbot/impl/aiBot/domain/model/Indicator; */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.Indicator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public MultiValue KWHzl(boolean z) {
            return copy$default(this, null, null, null, null, null, z, null, 95, null);
        }

        public final MultiValue copydefault(@NotNull List<Integer> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return copy$default(this, null, null, null, null, null, false, list, 63, null);
        }
    }

    public static final class FixedParams implements Indicator {
        public static final Parcelable.Creator<FixedParams> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final boolean copydefault;
        public final List<Number> djBIcL;
        public final List<ParamSpecUiModel> valueOf;

        public static final class Creator implements Parcelable.Creator<FixedParams> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FixedParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ParamSpecUiModel.CREATOR.createFromParcel(parcel));
                }
                boolean z = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readSerializable());
                }
                return new FixedParams(string, string2, string3, string4, arrayList, z, arrayList2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FixedParams[] newArray(int i) {
                return new FixedParams[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.tradingbot.impl.aiBot.domain.model.Indicator$FixedParams */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FixedParams copy$default(FixedParams fixedParams, String str, String str2, String str3, String str4, List list, boolean z, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fixedParams.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = fixedParams.AEQbTJ;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = fixedParams.KWHzl;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = fixedParams.EZpvd;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                list = fixedParams.valueOf;
            }
            List list3 = list;
            if ((i & 32) != 0) {
                z = fixedParams.copydefault;
            }
            boolean z2 = z;
            if ((i & 64) != 0) {
                list2 = fixedParams.djBIcL;
            }
            return fixedParams.AEQbTJ(str, str5, str6, str7, list3, z2, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FixedParams AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<ParamSpecUiModel> list, boolean z, @NotNull List<? extends Number> list2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new FixedParams(str, str2, str3, str4, list, z, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public List<ParamSpecUiModel> AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Number> AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String OLrzqt() {
            return this.EZpvd;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FixedParams)) {
                return false;
            }
            FixedParams fixedParams = (FixedParams) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) fixedParams.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) fixedParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) fixedParams.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) fixedParams.EZpvd) && Intrinsics.EZpvd(this.valueOf, fixedParams.valueOf) && this.copydefault == fixedParams.copydefault && Intrinsics.EZpvd(this.djBIcL, fixedParams.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public boolean gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.djBIcL.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FixedParams(id=" + this.OLrzqt + ", name=" + this.AEQbTJ + ", longName=" + this.KWHzl + ", description=" + this.EZpvd + ", paramSpecs=" + this.valueOf + ", isSelected=" + this.copydefault + ", paramValues=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.EZpvd);
            List<ParamSpecUiModel> list = this.valueOf;
            parcel.writeInt(list.size());
            Iterator<ParamSpecUiModel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            parcel.writeInt(this.copydefault ? 1 : 0);
            List<Number> list2 = this.djBIcL;
            parcel.writeInt(list2.size());
            Iterator<Number> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends java.lang.Number> */
        /* JADX WARN: Multi-variable type inference failed */
        public FixedParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<ParamSpecUiModel> list, boolean z, @NotNull List<? extends Number> list2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.OLrzqt = str;
            this.AEQbTJ = str2;
            this.KWHzl = str3;
            this.EZpvd = str4;
            this.valueOf = list;
            this.copydefault = z;
            this.djBIcL = list2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:109)) : (r16v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.tradingbot.impl.aiBot.domain.model.ParamSpecUiModel>, boolean, java.util.List<? extends java.lang.Number>):void (m)] (LINE:102) call: com.okinc.tradingbot.impl.aiBot.domain.model.Indicator.FixedParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, java.util.List):void type: THIS */
        public /* synthetic */ FixedParams(String str, String str2, String str3, String str4, List list, boolean z, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, list, (i & 32) != 0 ? false : z, (i & 64) != 0 ? yDY.AhwBna() : list2);
        }

        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.Indicator
        public String copydefault() {
            if (gEmmrt() && (!this.djBIcL.isEmpty())) {
                return CollectionsKt___CollectionsKt.joinToString$default(this.djBIcL, ", ", null, null, 0, null, new Function1() { // from class: o.uCD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return Indicator.FixedParams.EZpvd((java.lang.Number) obj);
                    }
                }, 30, null);
            }
            return null;
        }

        public static final CharSequence EZpvd(Number number) {
            Intrinsics.checkNotNullParameter(number, "");
            return pTB.formatDownToMax$default(C33129mqd.EZpvd(number), 8, null, 2, null);
        }

        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.Indicator
        public Map<String, Object> AEQbTJ() {
            List<Pair> listValues = CollectionsKt___CollectionsKt.values(AYXKKw(), this.djBIcL);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listValues, 10)), 16));
            for (Pair pair : listValues) {
                ParamSpecUiModel paramSpecUiModel = (ParamSpecUiModel) pair.component1();
                Pair pairOLrzqt = C56390yDp.OLrzqt(paramSpecUiModel.OLrzqt(), (Number) pair.component2());
                linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
            }
            return linkedHashMap;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Z)Lcom/okinc/tradingbot/impl/aiBot/domain/model/Indicator; */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.Indicator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public FixedParams KWHzl(boolean z) {
            return copy$default(this, null, null, null, null, null, z, null, 95, null);
        }

        public final FixedParams copydefault(@NotNull List<? extends Number> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return copy$default(this, null, null, null, null, null, false, list, 63, null);
        }
    }

    public static final class NoParams implements Indicator {
        public static final Parcelable.Creator<NoParams> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;
        public final boolean KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final List<ParamSpecUiModel> gEmmrt;

        public static final class Creator implements Parcelable.Creator<NoParams> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ParamSpecUiModel.CREATOR.createFromParcel(parcel));
                }
                return new NoParams(string, string2, string3, string4, arrayList, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoParams[] newArray(int i) {
                return new NoParams[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.tradingbot.impl.aiBot.domain.model.Indicator$NoParams */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NoParams copy$default(NoParams noParams, String str, String str2, String str3, String str4, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noParams.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = noParams.EZpvd;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = noParams.AEQbTJ;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = noParams.OLrzqt;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                list = noParams.gEmmrt;
            }
            List list2 = list;
            if ((i & 32) != 0) {
                z = noParams.KWHzl;
            }
            return noParams.EZpvd(str, str5, str6, str7, list2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public List<ParamSpecUiModel> AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NoParams EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<ParamSpecUiModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new NoParams(str, str2, str3, str4, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String OLrzqt() {
            return this.OLrzqt;
        }

        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.Indicator
        public String copydefault() {
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public String djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoParams)) {
                return false;
            }
            NoParams noParams = (NoParams) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) noParams.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) noParams.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) noParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) noParams.OLrzqt) && Intrinsics.EZpvd(this.gEmmrt, noParams.gEmmrt) && this.KWHzl == noParams.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase
        public boolean gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NoParams(id=" + this.copydefault + ", name=" + this.EZpvd + ", longName=" + this.AEQbTJ + ", description=" + this.OLrzqt + ", paramSpecs=" + this.gEmmrt + ", isSelected=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.OLrzqt);
            List<ParamSpecUiModel> list = this.gEmmrt;
            parcel.writeInt(list.size());
            Iterator<ParamSpecUiModel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            parcel.writeInt(this.KWHzl ? 1 : 0);
        }

        public NoParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<ParamSpecUiModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = str;
            this.EZpvd = str2;
            this.AEQbTJ = str3;
            this.OLrzqt = str4;
            this.gEmmrt = list;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.tradingbot.impl.aiBot.domain.model.ParamSpecUiModel>, boolean):void (m)] (LINE:144) call: com.okinc.tradingbot.impl.aiBot.domain.model.Indicator.NoParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):void type: THIS */
        public /* synthetic */ NoParams(String str, String str2, String str3, String str4, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, list, (i & 32) != 0 ? false : z);
        }

        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.Indicator
        public Map<String, Object> AEQbTJ() {
            return C56424yEw.KWHzl();
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Z)Lcom/okinc/tradingbot/impl/aiBot/domain/model/Indicator; */
        @Override // com.okinc.tradingbot.impl.aiBot.domain.model.Indicator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public NoParams KWHzl(boolean z) {
            return copy$default(this, null, null, null, null, null, z, 31, null);
        }
    }
}
