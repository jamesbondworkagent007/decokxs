package o;

import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55063xcq implements NL<java.io.InputStream, SVG> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull java.io.InputStream inputStream, @NotNull NM nm) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        Intrinsics.checkNotNullParameter(nm, "");
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public OC<SVG> copydefault(@NotNull java.io.InputStream inputStream, int i, int i2, @NotNull NM nm) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        Intrinsics.checkNotNullParameter(nm, "");
        try {
            SVG svgAEQbTJ = SVG.AEQbTJ(inputStream);
            if (i != Integer.MIN_VALUE) {
                svgAEQbTJ.OLrzqt(i);
            }
            if (i2 != Integer.MIN_VALUE) {
                svgAEQbTJ.KWHzl(i2);
            }
            return new PV(svgAEQbTJ);
        } catch (SVGParseException unused) {
            return null;
        }
    }
}
