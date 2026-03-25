package com.reown.android.pairing.model;

import com.reown.android.internal.common.model.type.ClientParams;
import com.reown.android.utils.ExtensionsKt;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56523yIn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class PairingParams implements ClientParams {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.pairing.model.PairingParams.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PairingParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PairingParams() {
    }

    @JsonClass(generateAdapter = true)
    public static final class DeleteParams extends PairingParams {
        public final int code;
        public final String message;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0006: INVOKE (wrap:o.yIn:0x0004: SGET  A[WRAPPED] (LINE:13) o.yIn.AEQbTJ o.yIn) STATIC call: com.reown.android.utils.ExtensionsKt.getDefaultId(o.yIn):int A[MD:(o.yIn):int (m), WRAPPED] (LINE:13)) : (r1v0 int))
  (r2v0 java.lang.String)
 A[MD:(int, java.lang.String):void (m)] (LINE:11) call: com.reown.android.pairing.model.PairingParams.DeleteParams.<init>(int, java.lang.String):void type: THIS */
        public /* synthetic */ DeleteParams(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? ExtensionsKt.getDefaultId(C56523yIn.AEQbTJ) : i, str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteParams(@Json(name = "code") int i, @Json(name = "message") @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.code = i;
            this.message = str;
        }
    }

    public static final class PingParams extends PairingParams {
        public PingParams() {
            super(null);
        }
    }
}
