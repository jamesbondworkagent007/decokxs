package aws.smithy.kotlin.runtime.serde.xml;

import o.C56444yFp;
import o.FA;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface XmlStreamReader {
    FA AEQbTJ();

    XmlStreamReader EZpvd(@NotNull SubtreeStartDepth subtreeStartDepth);

    void EZpvd();

    FA OLrzqt();

    FA copydefault(int i);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SubtreeStartDepth {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SubtreeStartDepth[] $VALUES;
        public static final SubtreeStartDepth CURRENT = new SubtreeStartDepth("CURRENT", 0);
        public static final SubtreeStartDepth CHILD = new SubtreeStartDepth("CHILD", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SubtreeStartDepth[] $values() {
            return new SubtreeStartDepth[]{CURRENT, CHILD};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SubtreeStartDepth> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static SubtreeStartDepth valueOf(String str) {
            return (SubtreeStartDepth) Enum.valueOf(SubtreeStartDepth.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static SubtreeStartDepth[] values() {
            return (SubtreeStartDepth[]) $VALUES.clone();
        }

        private SubtreeStartDepth(String str, int i) {
        }

        static {
            SubtreeStartDepth[] subtreeStartDepthArr$values = $values();
            $VALUES = subtreeStartDepthArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(subtreeStartDepthArr$values);
        }
    }

    public static final class StateListAnimator {
        public static /* synthetic */ XmlStreamReader subTreeReader$default(XmlStreamReader xmlStreamReader, SubtreeStartDepth subtreeStartDepth, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subTreeReader");
            }
            if ((i & 1) != 0) {
                subtreeStartDepth = SubtreeStartDepth.CHILD;
            }
            return xmlStreamReader.EZpvd(subtreeStartDepth);
        }

        public static /* synthetic */ FA peek$default(XmlStreamReader xmlStreamReader, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: peek");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return xmlStreamReader.copydefault(i);
        }
    }
}
