package o;

import android.graphics.RectF;
import androidx.constraintlayout.widget.Group;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.utils.MPPointF;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tWs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC46502tWs extends AbstractC46497tWn {
    public boolean AkhnZx;
    public final MPPointF AuCTel;
    public Group DbNXlk;
    public android.graphics.Paint ejfBZ;
    public java.util.ArrayList<android.widget.TextView> fARcdN;
    public java.util.ArrayList<android.widget.TextView> fIwbmz;
    public android.widget.TextView fJNWhG;
    public RectF fetchVPNInfo;
    public java.util.ArrayList<android.widget.TextView> getNewProxyInstance;
    public java.util.ArrayList<android.widget.TextView> hDKMBd;
    public Group uzCIH;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC46502tWs(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AkhnZx = true;
        this.fetchVPNInfo = new RectF();
        this.AuCTel = new MPPointF();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setLayoutDirection(3);
    }

    @Override // o.AbstractC46497tWn
    public android.view.View copydefault(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C47501trL.Application.RKcVTr, viewGroup, true);
        this.fJNWhG = (android.widget.TextView) viewInflate.findViewById(C47501trL.TaskDescription.pause);
        this.DbNXlk = (Group) viewInflate.findViewById(C47501trL.TaskDescription.UscePu);
        this.uzCIH = (Group) viewInflate.findViewById(C47501trL.TaskDescription.aHXSQp);
        this.fIwbmz = new java.util.ArrayList<>();
        this.fARcdN = new java.util.ArrayList<>();
        this.getNewProxyInstance = new java.util.ArrayList<>();
        this.hDKMBd = new java.util.ArrayList<>();
        java.util.ArrayList arrayList = this.fIwbmz;
        android.widget.TextView textView = null;
        if (arrayList == null) {
            Intrinsics.gEmmrt("");
            arrayList = null;
        }
        arrayList.add(viewInflate.findViewById(C47501trL.TaskDescription.sElUiK));
        java.util.ArrayList arrayList2 = this.fIwbmz;
        if (arrayList2 == null) {
            Intrinsics.gEmmrt("");
            arrayList2 = null;
        }
        arrayList2.add(viewInflate.findViewById(C47501trL.TaskDescription.zvzmfz));
        java.util.ArrayList arrayList3 = this.fIwbmz;
        if (arrayList3 == null) {
            Intrinsics.gEmmrt("");
            arrayList3 = null;
        }
        arrayList3.add(viewInflate.findViewById(C47501trL.TaskDescription.setLocationManually));
        java.util.ArrayList arrayList4 = this.fIwbmz;
        if (arrayList4 == null) {
            Intrinsics.gEmmrt("");
            arrayList4 = null;
        }
        arrayList4.add(viewInflate.findViewById(C47501trL.TaskDescription.GiPPlLQAswws));
        java.util.ArrayList arrayList5 = this.fARcdN;
        if (arrayList5 == null) {
            Intrinsics.gEmmrt("");
            arrayList5 = null;
        }
        arrayList5.add(viewInflate.findViewById(C47501trL.TaskDescription.OqHLSf));
        java.util.ArrayList arrayList6 = this.fARcdN;
        if (arrayList6 == null) {
            Intrinsics.gEmmrt("");
            arrayList6 = null;
        }
        arrayList6.add(viewInflate.findViewById(C47501trL.TaskDescription.gvFztT));
        java.util.ArrayList arrayList7 = this.fARcdN;
        if (arrayList7 == null) {
            Intrinsics.gEmmrt("");
            arrayList7 = null;
        }
        arrayList7.add(viewInflate.findViewById(C47501trL.TaskDescription.gCiISl));
        java.util.ArrayList arrayList8 = this.fARcdN;
        if (arrayList8 == null) {
            Intrinsics.gEmmrt("");
            arrayList8 = null;
        }
        arrayList8.add(viewInflate.findViewById(C47501trL.TaskDescription.isTimeProfileEmpty));
        java.util.ArrayList arrayList9 = this.getNewProxyInstance;
        if (arrayList9 == null) {
            Intrinsics.gEmmrt("");
            arrayList9 = null;
        }
        arrayList9.add(viewInflate.findViewById(C47501trL.TaskDescription.fXHmeK));
        java.util.ArrayList arrayList10 = this.getNewProxyInstance;
        if (arrayList10 == null) {
            Intrinsics.gEmmrt("");
            arrayList10 = null;
        }
        arrayList10.add(viewInflate.findViewById(C47501trL.TaskDescription.fLIjIY));
        java.util.ArrayList arrayList11 = this.getNewProxyInstance;
        if (arrayList11 == null) {
            Intrinsics.gEmmrt("");
            arrayList11 = null;
        }
        arrayList11.add(viewInflate.findViewById(C47501trL.TaskDescription.dvImUD));
        java.util.ArrayList arrayList12 = this.getNewProxyInstance;
        if (arrayList12 == null) {
            Intrinsics.gEmmrt("");
            arrayList12 = null;
        }
        arrayList12.add(viewInflate.findViewById(C47501trL.TaskDescription.apNbdB));
        java.util.ArrayList arrayList13 = this.hDKMBd;
        if (arrayList13 == null) {
            Intrinsics.gEmmrt("");
            arrayList13 = null;
        }
        arrayList13.add(viewInflate.findViewById(C47501trL.TaskDescription.dLBcXg));
        java.util.ArrayList arrayList14 = this.hDKMBd;
        if (arrayList14 == null) {
            Intrinsics.gEmmrt("");
            arrayList14 = null;
        }
        arrayList14.add(viewInflate.findViewById(C47501trL.TaskDescription.gmHjFq));
        java.util.ArrayList arrayList15 = this.hDKMBd;
        if (arrayList15 == null) {
            Intrinsics.gEmmrt("");
            arrayList15 = null;
        }
        arrayList15.add(viewInflate.findViewById(C47501trL.TaskDescription.gUEfcq));
        java.util.ArrayList arrayList16 = this.hDKMBd;
        if (arrayList16 == null) {
            Intrinsics.gEmmrt("");
            arrayList16 = null;
        }
        arrayList16.add(viewInflate.findViewById(C47501trL.TaskDescription.gSBher));
        android.graphics.Paint paint = new android.graphics.Paint();
        android.widget.TextView textView2 = this.fJNWhG;
        if (textView2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView = textView2;
        }
        paint.setTextSize(textView.getTextSize());
        this.ejfBZ = paint;
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return viewInflate;
    }

    public final boolean copydefault(float f, float f2) {
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(AEQbTJ().x, AEQbTJ().y);
        this.fetchVPNInfo.set(AEQbTJ().x + offsetForDrawingAtPoint.x, AEQbTJ().y + offsetForDrawingAtPoint.y, AEQbTJ().x + offsetForDrawingAtPoint.x + getWidth(), AEQbTJ().y + offsetForDrawingAtPoint.y + getHeight());
        return this.fetchVPNInfo.contains(f, f2);
    }

    public final void AYXKKw() {
        AEQbTJ().x = 0.0f;
        AEQbTJ().y = 0.0f;
    }

    public final void setTitleText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(str);
        android.widget.TextView textView = this.fJNWhG;
        android.widget.TextView textView2 = null;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(str);
        android.widget.TextView textView3 = this.fJNWhG;
        if (textView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView2 = textView3;
        }
        textView2.setVisibility(0);
    }

    public final void AEQbTJ(java.lang.String str) {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Paint paint = this.ejfBZ;
        Group group = null;
        if (paint == null) {
            Intrinsics.gEmmrt("");
            paint = null;
        }
        paint.getTextBounds(str, 0, str.length(), rect);
        if (rect.width() > C55298xhM.dp2px$default(156.0f, null, 1, null)) {
            Group group2 = this.DbNXlk;
            if (group2 == null) {
                Intrinsics.gEmmrt("");
                group2 = null;
            }
            group2.setVisibility(8);
            Group group3 = this.uzCIH;
            if (group3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                group = group3;
            }
            group.setVisibility(0);
            this.AkhnZx = false;
            return;
        }
        this.AkhnZx = true;
        Group group4 = this.DbNXlk;
        if (group4 == null) {
            Intrinsics.gEmmrt("");
            group4 = null;
        }
        group4.setVisibility(0);
        Group group5 = this.uzCIH;
        if (group5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            group = group5;
        }
        group.setVisibility(8);
    }

    public static /* synthetic */ Triple genContent$default(AbstractC46502tWs abstractC46502tWs, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: genContent");
        }
        if ((i2 & 4) != 0) {
            i = C33070mpX.copydefault(C52761wXj.Activity.UCQKYV);
        }
        return abstractC46502tWs.AEQbTJ(str, str2, i);
    }

    public final Triple<java.lang.String, java.lang.String, java.lang.Integer> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Triple<>(str, str2, java.lang.Integer.valueOf(i));
    }

    public final int copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C46489tWf c46489tWf = C46489tWf.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return c46489tWf.AEQbTJ(str, context);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        this.AuCTel.x = KWHzl(f);
        this.AuCTel.y = copydefault(f2);
        return this.AuCTel;
    }

    private final float KWHzl(float f) {
        int width = getWidth() / 2;
        Chart chartView = getChartView();
        float width2 = width;
        if (f < width2) {
            return -f;
        }
        if (chartView != null && f + width2 > chartView.getWidth()) {
            width2 = getWidth() - (chartView.getWidth() - f);
        }
        return -width2;
    }

    public float copydefault(float f) {
        if (getChartView() != null && f < r0.getHeight() - f) {
            copydefault().setVisibility(4);
            EZpvd().setVisibility(0);
            return OLrzqt();
        }
        EZpvd().setVisibility(4);
        copydefault().setVisibility(0);
        return -(getHeight() + OLrzqt());
    }

    public final void setContents(@NotNull Triple<java.lang.String, java.lang.String, java.lang.Integer>... tripleArr) {
        Triple<java.lang.String, java.lang.String, java.lang.Integer> triple;
        Triple<java.lang.String, java.lang.String, java.lang.Integer> triple2;
        Intrinsics.checkNotNullParameter(tripleArr, "");
        int i = 1;
        if (tripleArr.length == 0) {
            triple = null;
        } else {
            triple = tripleArr[0];
            int iZLjUOn = yDV.zLjUOn(tripleArr);
            if (iZLjUOn != 0) {
                int length = triple.getFirst().length();
                if (1 <= iZLjUOn) {
                    int i2 = 1;
                    while (true) {
                        Triple<java.lang.String, java.lang.String, java.lang.Integer> triple3 = tripleArr[i2];
                        int length2 = triple3.getFirst().length();
                        if (length < length2) {
                            triple = triple3;
                            length = length2;
                        }
                        if (i2 == iZLjUOn) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        if (tripleArr.length == 0) {
            triple2 = null;
        } else {
            triple2 = tripleArr[0];
            int iZLjUOn2 = yDV.zLjUOn(tripleArr);
            if (iZLjUOn2 != 0) {
                int length3 = triple2.getSecond().length();
                if (1 <= iZLjUOn2) {
                    while (true) {
                        Triple<java.lang.String, java.lang.String, java.lang.Integer> triple4 = tripleArr[i];
                        int length4 = triple4.getSecond().length();
                        if (length3 < length4) {
                            triple2 = triple4;
                            length3 = length4;
                        }
                        if (i == iZLjUOn2) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        java.lang.String first = triple != null ? triple.getFirst() : null;
        if (first == null) {
            first = "";
        }
        java.lang.String second = triple2 != null ? triple2.getSecond() : null;
        AEQbTJ(first + (second != null ? second : ""));
        java.util.ArrayList arrayList = new java.util.ArrayList(tripleArr.length);
        int length5 = tripleArr.length;
        for (int i3 = 0; i3 < length5; i3++) {
            arrayList.add(tripleArr[i3].getFirst());
        }
        KWHzl(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(tripleArr.length);
        for (Triple<java.lang.String, java.lang.String, java.lang.Integer> triple5 : tripleArr) {
            arrayList2.add(triple5.getSecond());
        }
        EZpvd(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(tripleArr.length);
        for (Triple<java.lang.String, java.lang.String, java.lang.Integer> triple6 : tripleArr) {
            arrayList3.add(java.lang.Integer.valueOf(triple6.getThird().intValue()));
        }
        AEQbTJ(arrayList3);
    }

    private final void KWHzl(java.util.List<java.lang.String> list) {
        java.util.ArrayList<android.widget.TextView> arrayList;
        java.util.Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            java.util.ArrayList<android.widget.TextView> arrayList2 = null;
            if (!it.hasNext()) {
                if (!this.AkhnZx ? (arrayList = this.getNewProxyInstance) != null : (arrayList = this.fIwbmz) != null) {
                    arrayList2 = arrayList;
                } else {
                    Intrinsics.gEmmrt("");
                }
                int i2 = 0;
                for (java.lang.Object obj : arrayList2) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    android.widget.TextView textView = (android.widget.TextView) obj;
                    if (i2 < list.size()) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    i2++;
                }
                return;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) next;
            if (this.AkhnZx) {
                java.util.ArrayList<android.widget.TextView> arrayList3 = this.fIwbmz;
                if (arrayList3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList2 = arrayList3;
                }
                android.widget.TextView textView2 = (android.widget.TextView) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, i);
                if (textView2 == null) {
                    return;
                } else {
                    textView2.setText(str);
                }
            } else {
                java.util.ArrayList<android.widget.TextView> arrayList4 = this.getNewProxyInstance;
                if (arrayList4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList2 = arrayList4;
                }
                android.widget.TextView textView3 = (android.widget.TextView) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, i);
                if (textView3 == null) {
                    return;
                } else {
                    textView3.setText(str);
                }
            }
            i++;
        }
    }

    private final void EZpvd(java.util.List<java.lang.String> list) {
        java.util.ArrayList<android.widget.TextView> arrayList;
        java.util.Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            java.util.ArrayList<android.widget.TextView> arrayList2 = null;
            if (!it.hasNext()) {
                if (!this.AkhnZx ? (arrayList = this.hDKMBd) != null : (arrayList = this.fARcdN) != null) {
                    arrayList2 = arrayList;
                } else {
                    Intrinsics.gEmmrt("");
                }
                int i2 = 0;
                for (java.lang.Object obj : arrayList2) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    android.widget.TextView textView = (android.widget.TextView) obj;
                    if (i2 < list.size()) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    i2++;
                }
                return;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) next;
            if (this.AkhnZx) {
                java.util.ArrayList<android.widget.TextView> arrayList3 = this.fARcdN;
                if (arrayList3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList2 = arrayList3;
                }
                android.widget.TextView textView2 = (android.widget.TextView) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, i);
                if (textView2 == null) {
                    return;
                } else {
                    textView2.setText(str);
                }
            } else {
                java.util.ArrayList<android.widget.TextView> arrayList4 = this.hDKMBd;
                if (arrayList4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList2 = arrayList4;
                }
                android.widget.TextView textView3 = (android.widget.TextView) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, i);
                if (textView3 == null) {
                    return;
                } else {
                    textView3.setText(str);
                }
            }
            i++;
        }
    }

    private final void AEQbTJ(java.util.List<java.lang.Integer> list) {
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            int iIntValue = ((java.lang.Number) obj).intValue();
            java.util.ArrayList<android.widget.TextView> arrayList = null;
            if (this.AkhnZx) {
                java.util.ArrayList<android.widget.TextView> arrayList2 = this.fARcdN;
                if (arrayList2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList = arrayList2;
                }
                android.widget.TextView textView = (android.widget.TextView) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i);
                if (textView == null) {
                    return;
                } else {
                    textView.setTextColor(iIntValue);
                }
            } else {
                java.util.ArrayList<android.widget.TextView> arrayList3 = this.hDKMBd;
                if (arrayList3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList = arrayList3;
                }
                android.widget.TextView textView2 = (android.widget.TextView) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i);
                if (textView2 == null) {
                    return;
                } else {
                    textView2.setTextColor(iIntValue);
                }
            }
            i++;
        }
    }
}
