package com.reown.android.internal.common.model;

import com.reown.foundation.common.model.Ttl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class IrnParams {
    public final boolean prompt;
    public final Tags tag;
    public final Ttl ttl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IrnParams copy$default(IrnParams irnParams, Tags tags, Ttl ttl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            tags = irnParams.tag;
        }
        if ((i & 2) != 0) {
            ttl = irnParams.ttl;
        }
        if ((i & 4) != 0) {
            z = irnParams.prompt;
        }
        return irnParams.copy(tags, ttl, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Tags component1() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Ttl component2() {
        return this.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.prompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IrnParams copy(@NotNull Tags tags, @NotNull Ttl ttl, boolean z) {
        Intrinsics.checkNotNullParameter(tags, "");
        Intrinsics.checkNotNullParameter(ttl, "");
        return new IrnParams(tags, ttl, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IrnParams)) {
            return false;
        }
        IrnParams irnParams = (IrnParams) obj;
        return this.tag == irnParams.tag && Intrinsics.EZpvd(this.ttl, irnParams.ttl) && this.prompt == irnParams.prompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPrompt() {
        return this.prompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Tags getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Ttl getTtl() {
        return this.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.tag.hashCode() * 31) + this.ttl.hashCode()) * 31) + Boolean.hashCode(this.prompt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IrnParams(tag=" + this.tag + ", ttl=" + this.ttl + ", prompt=" + this.prompt + ")";
    }

    public IrnParams(@NotNull Tags tags, @NotNull Ttl ttl, boolean z) {
        Intrinsics.checkNotNullParameter(tags, "");
        Intrinsics.checkNotNullParameter(ttl, "");
        this.tag = tags;
        this.ttl = ttl;
        this.prompt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.reown.android.internal.common.model.Tags)
  (r2v0 com.reown.foundation.common.model.Ttl)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(com.reown.android.internal.common.model.Tags, com.reown.foundation.common.model.Ttl, boolean):void (m)] (LINE:5) call: com.reown.android.internal.common.model.IrnParams.<init>(com.reown.android.internal.common.model.Tags, com.reown.foundation.common.model.Ttl, boolean):void type: THIS */
    public /* synthetic */ IrnParams(Tags tags, Ttl ttl, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tags, ttl, (i & 4) != 0 ? false : z);
    }
}
