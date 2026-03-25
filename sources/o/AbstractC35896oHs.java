package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC35896oHs extends C59534zip implements android.widget.SectionIndexer {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.util.HashMap<java.lang.Integer, java.lang.Integer> EZpvd;
    public final java.util.List<java.lang.Integer> KWHzl;
    public final java.lang.String copydefault;

    public abstract java.lang.String OLrzqt(int i);

    /* JADX INFO: renamed from: o.oHs$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oHs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC35896oHs(@NotNull java.util.List<? extends java.lang.Object> list) {
        super(list);
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = "SectionIndexerAdapter";
        this.EZpvd = new java.util.HashMap<>();
        this.KWHzl = new java.util.ArrayList();
    }

    /* JADX DEBUG: Method merged with bridge method: getSections()[Ljava/lang/Object; */
    @Override // android.widget.SectionIndexer
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.String[] getSections() {
        this.EZpvd.clear();
        this.KWHzl.clear();
        int itemCount = getItemCount();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (itemCount > 0) {
            for (int i = 0; i < itemCount; i++) {
                java.lang.String strEZpvd = EZpvd(i);
                if (!arrayList.contains(strEZpvd) && new Regex("^[a-zA-Z#]+$").matches(strEZpvd)) {
                    arrayList.add(strEZpvd);
                    this.KWHzl.add(java.lang.Integer.valueOf(i));
                }
            }
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((java.lang.String) it.next());
        }
        this.EZpvd = OLrzqt(arrayList, arrayList2);
        pUU.KWHzl(this.copydefault, "getSections:" + arrayList.toArray(new java.lang.String[0]));
        return (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        java.util.List<java.lang.Integer> list = this.KWHzl;
        java.lang.Integer num = this.EZpvd.get(java.lang.Integer.valueOf(i));
        Intrinsics.copydefault(num);
        int iIntValue = list.get(num.intValue()).intValue();
        pUU.KWHzl(this.copydefault, "getPositionForSection->section:" + i + " position:" + iIntValue);
        return iIntValue;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        pUU.EZpvd(this.copydefault, "getSectionForPosition->position:" + i + " sectionIndex:0");
        return 0;
    }

    public final java.lang.String EZpvd(int i) {
        java.lang.String strOLrzqt = OLrzqt(i);
        if (strOLrzqt != null && strOLrzqt.length() != 0 && strOLrzqt.length() == 1) {
            return strOLrzqt;
        }
        throw new java.lang.IllegalArgumentException("invalid Alphabet text:" + strOLrzqt + " @Position:" + i);
    }

    public final java.util.HashMap<java.lang.Integer, java.lang.Integer> OLrzqt(java.util.List<java.lang.String> list, java.util.ArrayList<java.lang.String> arrayList) {
        java.util.HashMap<java.lang.Integer, java.lang.Integer> map = new java.util.HashMap<>();
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                map.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            } else {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd(it.next(), (java.lang.Object) str)) {
                        java.util.Iterator<java.lang.String> it2 = list.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (Intrinsics.EZpvd((java.lang.Object) it2.next(), (java.lang.Object) str)) {
                                i2 = i3;
                                break;
                            }
                            i3++;
                        }
                        map.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
                    }
                }
                map.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            }
            i++;
        }
        return map;
    }
}
