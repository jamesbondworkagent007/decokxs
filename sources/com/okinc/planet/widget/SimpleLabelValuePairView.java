package com.okinc.planet.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.planet.widget.SimpleLabelValuePairView;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C47501trL;
import o.C52761wXj;
import o.C55298xhM;
import o.C55302xhQ;
import o.C55320xhi;
import o.tOC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SimpleLabelValuePairView extends ConstraintLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public tOC AEQbTJ;

    public interface StateListAnimator {
        float AEQbTJ();

        String EZpvd();

        float KWHzl();

        int OLrzqt();

        String copydefault();

        int djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleLabelValuePairView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleLabelValuePairView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: com.okinc.planet.widget.SimpleLabelValuePairView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ SimpleLabelValuePairView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleLabelValuePairView(@NotNull Context context, AttributeSet attributeSet, int i) {
        Object objValueOf;
        Object objValueOf2;
        TextView textView;
        C55320xhi c55320xhi;
        C55320xhi c55320xhi2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = tOC.AEQbTJ(LayoutInflater.from(context), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C47501trL.FragmentManager.flVtFt);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        CharSequence string$default = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C47501trL.FragmentManager.iZzfmt, 0, 4, null);
        int color = typedArrayObtainStyledAttributes.getColor(C47501trL.FragmentManager.iRxXKY, C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.AxsJAYaxsJAY, false);
        Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(C47501trL.FragmentManager.gkJEwt, -1));
        numValueOf = numValueOf.intValue() == -1 ? null : numValueOf;
        if (numValueOf != null) {
            objValueOf = Integer.valueOf(C55298xhM.px2dp$default(numValueOf.intValue(), (Context) null, 1, (Object) null));
        } else {
            objValueOf = Float.valueOf(12.0f);
        }
        Integer numValueOf2 = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(C47501trL.FragmentManager.hUfVAv, -1));
        numValueOf2 = numValueOf2.intValue() == -1 ? null : numValueOf2;
        if (numValueOf2 != null) {
            objValueOf2 = Integer.valueOf(C55298xhM.px2dp$default(numValueOf2.intValue(), (Context) null, 1, (Object) null));
        } else {
            objValueOf2 = Float.valueOf(12.0f);
        }
        tOC toc = this.AEQbTJ;
        if (toc != null && (c55320xhi2 = toc.copydefault) != null) {
            c55320xhi2.setText(string$default);
            c55320xhi2.setTextColor(color);
            c55320xhi2.setShowUnderline(z);
        }
        tOC toc2 = this.AEQbTJ;
        if (toc2 != null && (c55320xhi = toc2.copydefault) != null) {
            c55320xhi.setTextSize(C33129mqd.djBIcL(objValueOf));
        }
        tOC toc3 = this.AEQbTJ;
        if (toc3 != null && (textView = toc3.KWHzl) != null) {
            textView.setTextSize(C33129mqd.djBIcL(objValueOf2));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.widget.SimpleLabelValuePairView.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final class Normal implements StateListAnimator, Parcelable {
        public static final Parcelable.Creator<Normal> CREATOR = new Creator();
        public final float AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final float OLrzqt;
        public final int copydefault;
        public final int djBIcL;

        public static final class Creator implements Parcelable.Creator<Normal> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Normal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Normal(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Normal[] newArray(int i) {
                return new Normal[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Normal copy$default(Normal normal, String str, String str2, int i, int i2, float f, float f2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = normal.KWHzl;
            }
            if ((i3 & 2) != 0) {
                str2 = normal.EZpvd;
            }
            String str3 = str2;
            if ((i3 & 4) != 0) {
                i = normal.djBIcL;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = normal.copydefault;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                f = normal.OLrzqt;
            }
            float f3 = f;
            if ((i3 & 32) != 0) {
                f2 = normal.AEQbTJ;
            }
            return normal.AEQbTJ(str, str3, i4, i5, f3, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Normal AEQbTJ(@NotNull String str, @NotNull String str2, int i, int i2, float f, float f2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Normal(str, str2, i, i2, f, f2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public float KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public String copydefault() {
            return this.KWHzl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public int djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Normal)) {
                return false;
            }
            Normal normal = (Normal) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) normal.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) normal.EZpvd) && this.djBIcL == normal.djBIcL && this.copydefault == normal.copydefault && Float.compare(this.OLrzqt, normal.OLrzqt) == 0 && Float.compare(this.AEQbTJ, normal.AEQbTJ) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + Integer.hashCode(this.djBIcL)) * 31) + Integer.hashCode(this.copydefault)) * 31) + Float.hashCode(this.OLrzqt)) * 31) + Float.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Normal(labelText=" + this.KWHzl + ", valueText=" + this.EZpvd + ", valueTextColor=" + this.djBIcL + ", labelTextColor=" + this.copydefault + ", labelSizeSp=" + this.OLrzqt + ", valueSizeSp=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.EZpvd);
            parcel.writeInt(this.djBIcL);
            parcel.writeInt(this.copydefault);
            parcel.writeFloat(this.OLrzqt);
            parcel.writeFloat(this.AEQbTJ);
        }

        public Normal(@NotNull String str, @NotNull String str2, int i, int i2, float f, float f2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.djBIcL = i;
            this.copydefault = i2;
            this.OLrzqt = f;
            this.AEQbTJ = f2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 int)
  (wrap:int:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (12.0f float) : (r12v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (12.0f float) : (r13v0 float))
 A[MD:(java.lang.String, java.lang.String, int, int, float, float):void (m)] (LINE:37) call: com.okinc.planet.widget.SimpleLabelValuePairView.Normal.<init>(java.lang.String, java.lang.String, int, int, float, float):void type: THIS */
        public /* synthetic */ Normal(String str, String str2, int i, int i2, float f, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? 12.0f : f, (i3 & 32) != 0 ? 12.0f : f2);
        }
    }

    public static final class Underline implements StateListAnimator, Parcelable {
        public static final Parcelable.Creator<Underline> CREATOR = new Creator();
        public final Function0<Unit> AEQbTJ;
        public final int AYXKKw;
        public final int EZpvd;
        public final float KWHzl;
        public final String OLrzqt;
        public final float copydefault;
        public final String valueOf;

        public static final class Creator implements Parcelable.Creator<Underline> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Underline createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Underline(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), (Function0) parcel.readSerializable());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Underline[] newArray(int i) {
                return new Underline[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.planet.widget.SimpleLabelValuePairView$Underline */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Underline copy$default(Underline underline, String str, String str2, int i, int i2, float f, float f2, Function0 function0, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = underline.OLrzqt;
            }
            if ((i3 & 2) != 0) {
                str2 = underline.valueOf;
            }
            String str3 = str2;
            if ((i3 & 4) != 0) {
                i = underline.AYXKKw;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = underline.EZpvd;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                f = underline.KWHzl;
            }
            float f3 = f;
            if ((i3 & 32) != 0) {
                f2 = underline.copydefault;
            }
            float f4 = f2;
            if ((i3 & 64) != 0) {
                function0 = underline.AEQbTJ;
            }
            return underline.OLrzqt(str, str3, i4, i5, f3, f4, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public float AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> AhwBna() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public String EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public float KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Underline OLrzqt(@NotNull String str, @NotNull String str2, int i, int i2, float f, float f2, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            return new Underline(str, str2, i, i2, f, f2, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public String copydefault() {
            return this.OLrzqt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet.widget.SimpleLabelValuePairView.StateListAnimator
        public int djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Underline)) {
                return false;
            }
            Underline underline = (Underline) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) underline.OLrzqt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) underline.valueOf) && this.AYXKKw == underline.AYXKKw && this.EZpvd == underline.EZpvd && Float.compare(this.KWHzl, underline.KWHzl) == 0 && Float.compare(this.copydefault, underline.copydefault) == 0 && Intrinsics.EZpvd(this.AEQbTJ, underline.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.OLrzqt.hashCode() * 31) + this.valueOf.hashCode()) * 31) + Integer.hashCode(this.AYXKKw)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Float.hashCode(this.KWHzl)) * 31) + Float.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Underline(labelText=" + this.OLrzqt + ", valueText=" + this.valueOf + ", valueTextColor=" + this.AYXKKw + ", labelTextColor=" + this.EZpvd + ", labelSizeSp=" + this.KWHzl + ", valueSizeSp=" + this.copydefault + ", onClick=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.valueOf);
            parcel.writeInt(this.AYXKKw);
            parcel.writeInt(this.EZpvd);
            parcel.writeFloat(this.KWHzl);
            parcel.writeFloat(this.copydefault);
            parcel.writeSerializable((Serializable) this.AEQbTJ);
        }

        public Underline(@NotNull String str, @NotNull String str2, int i, int i2, float f, float f2, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.OLrzqt = str;
            this.valueOf = str2;
            this.AYXKKw = i;
            this.EZpvd = i2;
            this.KWHzl = f;
            this.copydefault = f2;
            this.AEQbTJ = function0;
        }
    }

    public static /* synthetic */ void setLabelText$default(SimpleLabelValuePairView simpleLabelValuePairView, String str, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        simpleLabelValuePairView.setLabelText(str, f);
    }

    public final void setLabelText(@NotNull String str, float f) {
        tOC toc;
        C55320xhi c55320xhi;
        C55320xhi c55320xhi2;
        Intrinsics.checkNotNullParameter(str, "");
        tOC toc2 = this.AEQbTJ;
        if (toc2 != null && (c55320xhi2 = toc2.copydefault) != null) {
            c55320xhi2.setText(str);
        }
        if (f <= 0.0f || (toc = this.AEQbTJ) == null || (c55320xhi = toc.copydefault) == null) {
            return;
        }
        c55320xhi.setTextSize(2, f);
    }

    public final void setOnLabelClickListener(boolean z, View.OnClickListener onClickListener) {
        C55320xhi c55320xhi;
        C55320xhi c55320xhi2;
        tOC toc = this.AEQbTJ;
        if (toc != null && (c55320xhi2 = toc.copydefault) != null) {
            c55320xhi2.setShowUnderline(z);
        }
        tOC toc2 = this.AEQbTJ;
        if (toc2 == null || (c55320xhi = toc2.copydefault) == null) {
            return;
        }
        c55320xhi.setOnClickListener(onClickListener);
    }

    public static /* synthetic */ void setValueText$default(SimpleLabelValuePairView simpleLabelValuePairView, String str, Integer num, float f, Typeface typeface, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            typeface = null;
        }
        simpleLabelValuePairView.setValueText(str, num, f, typeface);
    }

    public final void setValueText(@NotNull String str, Integer num, float f, Typeface typeface) {
        tOC toc;
        TextView textView;
        tOC toc2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        Intrinsics.checkNotNullParameter(str, "");
        tOC toc3 = this.AEQbTJ;
        if (toc3 != null && (textView4 = toc3.KWHzl) != null) {
            textView4.setText(str);
        }
        if (num != null) {
            num.intValue();
            tOC toc4 = this.AEQbTJ;
            if (toc4 != null && (textView3 = toc4.KWHzl) != null) {
                textView3.setTextColor(num.intValue());
            }
        }
        if (f > 0.0f && (toc2 = this.AEQbTJ) != null && (textView2 = toc2.KWHzl) != null) {
            textView2.setTextSize(2, f);
        }
        if (typeface == null || (toc = this.AEQbTJ) == null || (textView = toc.KWHzl) == null) {
            return;
        }
        textView.setTypeface(typeface);
    }

    public final void setContent(@NotNull final StateListAnimator stateListAnimator) {
        C55320xhi c55320xhi;
        C55320xhi c55320xhi2;
        tOC toc;
        TextView textView;
        tOC toc2;
        C55320xhi c55320xhi3;
        TextView textView2;
        TextView textView3;
        C55320xhi c55320xhi4;
        C55320xhi c55320xhi5;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        tOC toc3 = this.AEQbTJ;
        if (toc3 != null && (c55320xhi5 = toc3.copydefault) != null) {
            c55320xhi5.setText(stateListAnimator.copydefault());
        }
        tOC toc4 = this.AEQbTJ;
        if (toc4 != null && (c55320xhi4 = toc4.copydefault) != null) {
            c55320xhi4.setTextSize(2, stateListAnimator.AEQbTJ());
        }
        tOC toc5 = this.AEQbTJ;
        if (toc5 != null && (textView3 = toc5.KWHzl) != null) {
            textView3.setText(stateListAnimator.EZpvd());
        }
        tOC toc6 = this.AEQbTJ;
        if (toc6 != null && (textView2 = toc6.KWHzl) != null) {
            textView2.setTextSize(2, stateListAnimator.KWHzl());
        }
        if (stateListAnimator.OLrzqt() != 0 && (toc2 = this.AEQbTJ) != null && (c55320xhi3 = toc2.copydefault) != null) {
            c55320xhi3.setTextColor(stateListAnimator.OLrzqt());
        }
        if (stateListAnimator.djBIcL() != 0 && (toc = this.AEQbTJ) != null && (textView = toc.KWHzl) != null) {
            textView.setTextColor(stateListAnimator.djBIcL());
        }
        if (stateListAnimator instanceof Underline) {
            tOC toc7 = this.AEQbTJ;
            if (toc7 != null && (c55320xhi2 = toc7.copydefault) != null) {
                c55320xhi2.setShowUnderline(true);
            }
            tOC toc8 = this.AEQbTJ;
            if (toc8 == null || (c55320xhi = toc8.copydefault) == null) {
                return;
            }
            c55320xhi.setOnClickListener(new View.OnClickListener() { // from class: o.tVq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    SimpleLabelValuePairView.setContent$lambda$4(stateListAnimator, view);
                }
            });
        }
    }

    public static final void setContent$lambda$4(StateListAnimator stateListAnimator, View view) {
        ((Underline) stateListAnimator).AhwBna().invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C55320xhi c55320xhi;
        tOC toc = this.AEQbTJ;
        if (toc != null && (c55320xhi = toc.copydefault) != null) {
            c55320xhi.setOnClickListener(null);
        }
        this.AEQbTJ = null;
        super.onDetachedFromWindow();
    }
}
