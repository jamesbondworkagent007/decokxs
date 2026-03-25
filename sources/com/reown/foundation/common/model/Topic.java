package com.reown.foundation.common.model;

import com.reown.util.UtilFunctionsKt;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = false)
public final class Topic {
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Topic() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Topic copy$default(Topic topic, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topic.value;
        }
        return topic.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Topic(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Topic) && Intrinsics.EZpvd((Object) this.value, (Object) ((Topic) obj).value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Topic(value=" + this.value + ")";
    }

    public Topic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0006: INVOKE (wrap:o.yIt:0x0004: SGET  A[WRAPPED] (LINE:7) o.yIt.KWHzl o.yIt) STATIC call: com.reown.util.UtilFunctionsKt.getEmpty(o.yIt):java.lang.String A[MD:(o.yIt):java.lang.String (m), WRAPPED] (LINE:7)) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:7) call: com.reown.foundation.common.model.Topic.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ Topic(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UtilFunctionsKt.getEmpty(C56529yIt.KWHzl) : str);
    }
}
