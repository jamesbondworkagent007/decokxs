package o;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27485jwA<T> implements yIP<AppCompatActivity, T> {
    public T OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lo/yJA;Ljava/lang/Object;)V */
    @Override // o.yIP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull AppCompatActivity appCompatActivity, @NotNull yJA<?> yja, @NotNull T t) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(yja, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.OLrzqt = t;
    }

    /* JADX DEBUG: Method merged with bridge method: getValue(Ljava/lang/Object;Lo/yJA;)Ljava/lang/Object; */
    @Override // o.yIP, o.yIO
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public T getValue(@NotNull AppCompatActivity appCompatActivity, @NotNull yJA<?> yja) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(yja, "");
        T t = this.OLrzqt;
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException("should never call auto-cleared-value get when it might not be available".toString());
    }
}
