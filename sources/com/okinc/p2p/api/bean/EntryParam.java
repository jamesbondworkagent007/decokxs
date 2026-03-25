package com.okinc.p2p.api.bean;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class EntryParam {
    public static final int $stable = 8;
    private final Bundle bundle;
    private final EntrySource source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EntryParam copy$default(EntryParam entryParam, EntrySource entrySource, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            entrySource = entryParam.source;
        }
        if ((i & 2) != 0) {
            bundle = entryParam.bundle;
        }
        return entryParam.copy(entrySource, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySource component1() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle component2() {
        return this.bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntryParam copy(@NotNull EntrySource entrySource, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(entrySource, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        return new EntryParam(entrySource, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryParam)) {
            return false;
        }
        EntryParam entryParam = (EntryParam) obj;
        return this.source == entryParam.source && Intrinsics.EZpvd(this.bundle, entryParam.bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle getBundle() {
        return this.bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySource getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.source.hashCode() * 31) + this.bundle.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EntryParam(source=" + this.source + ", bundle=" + this.bundle + ")";
    }

    public EntryParam(@NotNull EntrySource entrySource, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(entrySource, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        this.source = entrySource;
        this.bundle = bundle;
    }
}
