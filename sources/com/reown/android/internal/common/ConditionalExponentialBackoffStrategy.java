package com.reown.android.internal.common;

import o.C56548yJl;
import o.InterfaceC58080yuY;

/* JADX INFO: loaded from: classes12.dex */
public final class ConditionalExponentialBackoffStrategy implements InterfaceC58080yuY {
    public final long initialDurationMillis;
    public final long maxDurationMillis;
    public boolean shouldBackoff;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58080yuY
    public boolean getShouldBackoff() {
        return this.shouldBackoff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setShouldBackoff(boolean z) {
        this.shouldBackoff = z;
    }

    public ConditionalExponentialBackoffStrategy(long j, long j2) {
        this.initialDurationMillis = j;
        this.maxDurationMillis = j2;
        if (j <= 0) {
            throw new IllegalArgumentException(("initialDurationMillis, " + j + ", must be positive").toString());
        }
        if (j2 > 0) {
            return;
        }
        throw new IllegalArgumentException(("maxDurationMillis, " + j2 + ", must be positive").toString());
    }

    public final void shouldBackoff(boolean z) {
        setShouldBackoff(z);
    }

    @Override // o.InterfaceC58080yuY
    public long backoffDurationMillisAt(int i) {
        return (long) C56548yJl.gEmmrt(this.maxDurationMillis, this.initialDurationMillis * Math.pow(2.0d, i));
    }
}
