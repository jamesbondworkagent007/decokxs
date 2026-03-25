package o;

import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import o.C59489zhx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59489zhx implements MatchResult {
    public final InterfaceC59483zhr AEQbTJ;
    public final Matcher EZpvd;
    public final java.lang.CharSequence OLrzqt;
    public java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.text.MatchResult
    public InterfaceC59483zhr EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.regex.MatchResult gEmmrt() {
        return this.EZpvd;
    }

    public C59489zhx(@NotNull Matcher matcher, @NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(matcher, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.EZpvd = matcher;
        this.OLrzqt = charSequence;
        this.AEQbTJ = new Activity();
    }

    @Override // kotlin.text.MatchResult
    public MatchResult.ActionBar AEQbTJ() {
        return MatchResult.Activity.EZpvd(this);
    }

    @Override // kotlin.text.MatchResult
    public kotlin.ranges.IntRange copydefault() {
        return C59488zhw.AEQbTJ(gEmmrt());
    }

    @Override // kotlin.text.MatchResult
    public java.lang.String KWHzl() {
        java.lang.String strGroup = gEmmrt().group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "");
        return strGroup;
    }

    /* JADX INFO: renamed from: o.zhx$Activity */
    public static final class Activity extends AbstractC56400yDz<MatchGroup> implements InterfaceC59482zhq {
        @Override // o.AbstractC56400yDz, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        public Activity() {
        }

        public boolean AEQbTJ(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            if (obj == null || (obj instanceof MatchGroup)) {
                return AEQbTJ((MatchGroup) obj);
            }
            return false;
        }

        @Override // o.AbstractC56400yDz
        public int getSize() {
            return C59489zhx.this.gEmmrt().groupCount() + 1;
        }

        public static final MatchGroup copydefault(Activity activity, int i) {
            return activity.OLrzqt(i);
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<MatchGroup> iterator() {
            return C59467zhb.fetchVPNInfo(CollectionsKt___CollectionsKt.QVAiDq(yDY.valueOf((java.util.Collection<?>) this)), new Function1() { // from class: o.zhu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C59489zhx.Activity.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            }).iterator();
        }

        @Override // o.InterfaceC59483zhr
        public MatchGroup OLrzqt(int i) {
            kotlin.ranges.IntRange intRangeAEQbTJ = C59488zhw.AEQbTJ(C59489zhx.this.gEmmrt(), i);
            if (intRangeAEQbTJ.getStart().intValue() < 0) {
                return null;
            }
            java.lang.String strGroup = C59489zhx.this.gEmmrt().group(i);
            Intrinsics.checkNotNullExpressionValue(strGroup, "");
            return new MatchGroup(strGroup, intRangeAEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.zhx$ActionBar */
    public static final class ActionBar extends yDG<java.lang.String> {
        public ActionBar() {
        }

        public int KWHzl(java.lang.String str) {
            return super.lastIndexOf(str);
        }

        public boolean OLrzqt(java.lang.String str) {
            return super.contains(str);
        }

        @Override // o.AbstractC56400yDz, java.util.Collection, java.util.List
        public final boolean contains(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return OLrzqt((java.lang.String) obj);
            }
            return false;
        }

        public int copydefault(java.lang.String str) {
            return super.indexOf(str);
        }

        @Override // o.yDG, java.util.List
        public final int indexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return copydefault((java.lang.String) obj);
            }
            return -1;
        }

        @Override // o.yDG, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.String) {
                return KWHzl((java.lang.String) obj);
            }
            return -1;
        }

        @Override // o.yDG, o.AbstractC56400yDz
        public int getSize() {
            return C59489zhx.this.gEmmrt().groupCount() + 1;
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // o.yDG, java.util.List
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.lang.String get(int i) {
            java.lang.String strGroup = C59489zhx.this.gEmmrt().group(i);
            return strGroup == null ? "" : strGroup;
        }
    }

    @Override // kotlin.text.MatchResult
    public java.util.List<java.lang.String> OLrzqt() {
        if (this.copydefault == null) {
            this.copydefault = new ActionBar();
        }
        java.util.List<java.lang.String> list = this.copydefault;
        Intrinsics.copydefault(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult AYXKKw() {
        int iEnd = gEmmrt().end() + (gEmmrt().end() == gEmmrt().start() ? 1 : 0);
        if (iEnd > this.OLrzqt.length()) {
            return null;
        }
        Matcher matcher = this.EZpvd.pattern().matcher(this.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(matcher, "");
        return C59488zhw.AEQbTJ(matcher, iEnd, this.OLrzqt);
    }
}
