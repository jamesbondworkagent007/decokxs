package com.okinc.lexical.linebreak;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class RichLineBreak extends BaseRichTextBlock {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RichLineBreak> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RichLineBreak> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichLineBreak createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new RichLineBreak();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichLineBreak[] newArray(int i) {
            return new RichLineBreak[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.lexical.linebreak.RichLineBreak.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RichLineBreak> serializer() {
            return RichLineBreak$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r8v0 int)
  (wrap:java.lang.String:0x0005: CHECK_CAST (java.lang.String) (wrap:java.lang.Object:0x0000: INVOKE (r9v0 int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:8)))
  (wrap:int:0x0009: INVOKE (wrap:java.lang.Number:0x0007: CHECK_CAST (java.lang.Number) (r10v0 java.lang.String)) VIRTUAL call: java.lang.Number.intValue():int A[MD:():int (c), WRAPPED])
  (wrap:java.lang.String:0x0012: CHECK_CAST (java.lang.String) (wrap:java.lang.Object:0x000d: INVOKE (r11v0 int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED]))
  (wrap:int:0x0016: INVOKE (wrap:java.lang.Number:0x0014: CHECK_CAST (java.lang.Number) (r12v0 java.lang.String)) VIRTUAL call: java.lang.Number.intValue():int A[MD:():int (c), WRAPPED])
  (r13v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, int, java.lang.String, int, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] (LINE:8) call: com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock.<init>(int, java.lang.String, int, java.lang.String, int, kotlinx.serialization.internal.SerializationConstructorMarker):void type: SUPER */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RichLineBreak(int i, int i2, String str, int i3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, (String) Integer.valueOf(i2), ((Number) str).intValue(), (String) Integer.valueOf(i3), ((Number) str2).intValue(), serializationConstructorMarker);
    }

    public RichLineBreak() {
    }
}
