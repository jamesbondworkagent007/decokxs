package com.okinc.tradingbot.impl.common.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradingbot.impl.dto.NumericString;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C33512mxp;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface TextColor extends Parcelable {
    public static final ActionBar Companion = ActionBar.OLrzqt;

    int copydefault(@NotNull Context context);

    public static final class Up implements TextColor {
        public static final Up copydefault = new Up();
        public static final Parcelable.Creator<Up> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Up> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Up createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Up.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Up[] newArray(int i) {
                return new Up[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private Up() {
        }

        @Override // com.okinc.tradingbot.impl.common.model.TextColor
        public int copydefault(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        }
    }

    public static final class Down implements TextColor {
        public static final Down copydefault = new Down();
        public static final Parcelable.Creator<Down> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Down> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Down createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Down.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Down[] newArray(int i) {
                return new Down[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private Down() {
        }

        @Override // com.okinc.tradingbot.impl.common.model.TextColor
        public int copydefault(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        }
    }

    public static final class Zero implements TextColor {
        public static final Zero OLrzqt = new Zero();
        public static final Parcelable.Creator<Zero> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Zero> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Zero createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Zero.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Zero[] newArray(int i) {
                return new Zero[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private Zero() {
        }

        @Override // com.okinc.tradingbot.impl.common.model.TextColor
        public int copydefault(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C33070mpX.OLrzqt(C52761wXj.Activity.fdOvFl, context);
        }
    }

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
        }

        public final TextColor copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C33129mqd.AEQbTJ(NumericString.copydefault(str), 0) ? Up.copydefault : C33129mqd.gEmmrt(NumericString.copydefault(str), 0) ? Down.copydefault : Zero.OLrzqt;
        }

        public final TextColor OLrzqt(@NotNull Number number) {
            Intrinsics.checkNotNullParameter(number, "");
            return C33129mqd.AEQbTJ(number, 0) ? Up.copydefault : C33129mqd.gEmmrt(number, 0) ? Down.copydefault : Zero.OLrzqt;
        }
    }
}
