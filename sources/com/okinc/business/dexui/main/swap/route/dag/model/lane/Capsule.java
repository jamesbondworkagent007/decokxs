package com.okinc.business.dexui.main.swap.route.dag.model.lane;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class Capsule {
    public static final int $stable = 8;
    private final RectF rect;
    private final String text;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Capsule copy$default(Capsule capsule, String str, RectF rectF, int i, Object obj) {
        if ((i & 1) != 0) {
            str = capsule.text;
        }
        if ((i & 2) != 0) {
            rectF = capsule.rect;
        }
        return capsule.copy(str, rectF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF component2() {
        return this.rect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Capsule copy(@NotNull String str, @NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rectF, "");
        return new Capsule(str, rectF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Capsule)) {
            return false;
        }
        Capsule capsule = (Capsule) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) capsule.text) && Intrinsics.EZpvd(this.rect, capsule.rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF getRect() {
        return this.rect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.text.hashCode() * 31) + this.rect.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Capsule(text=" + this.text + ", rect=" + this.rect + ")";
    }

    public Capsule(@NotNull String str, @NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rectF, "");
        this.text = str;
        this.rect = rectF;
    }
}
