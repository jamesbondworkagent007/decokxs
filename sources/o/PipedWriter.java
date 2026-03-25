package o;

import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C59449zhJ;
import o.Reader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PipedWriter {
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.util.Map<java.lang.String, ? extends java.lang.String> AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean AEQbTJ(java.util.Map<java.lang.String, ? extends java.lang.String> map, java.lang.Object obj) {
        return (obj instanceof PipedWriter) && Intrinsics.EZpvd(map, ((PipedWriter) obj).KWHzl());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OLrzqt(java.util.Map<java.lang.String, ? extends java.lang.String> map) {
        return map.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ java.util.Map KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return AEQbTJ(this.AEQbTJ, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return OLrzqt(this.AEQbTJ);
    }

    public static java.lang.String copydefault(java.util.Map<java.lang.String, ? extends java.lang.String> map) {
        return CollectionsKt___CollectionsKt.joinToString$default(map.entrySet(), " ", null, null, 0, null, new Function1<Map.Entry<? extends java.lang.String, ? extends java.lang.String>, java.lang.CharSequence>() { // from class: aws.sdk.kotlin.runtime.http.AdditionalMetadata$toString$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
                return invoke2((Map.Entry<String, String>) entry);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(@NotNull Map.Entry<String, String> entry) {
                Intrinsics.checkNotNullParameter(entry, "");
                String key = entry.getKey();
                String value = entry.getValue();
                if (C59449zhJ.gEmmrt(value, "true", true)) {
                    value = null;
                }
                return Reader.AEQbTJ("md", key, value);
            }
        }, 30, null);
    }

    public java.lang.String toString() {
        return copydefault(this.AEQbTJ);
    }
}
