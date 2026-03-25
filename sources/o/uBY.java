package o;

import android.graphics.RectF;
import androidx.constraintlayout.widget.Group;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.utils.MPPointF;
import java.math.BigDecimal;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.uBT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class uBY extends uBX {
    public final MPPointF AuCTel;
    public java.util.ArrayList<android.widget.TextView> ejfBZ;
    public android.graphics.Paint fARcdN;
    public Group fIwbmz;
    public boolean fJNWhG;
    public RectF fetchVPNInfo;
    public java.util.ArrayList<android.widget.TextView> getFieldNames;
    public android.widget.TextView getNewProxyInstance;
    public Group hDKMBd;
    public java.util.ArrayList<android.widget.TextView> iwGUEr;
    public java.util.ArrayList<android.widget.TextView> uzCIH;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uBY(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.fJNWhG = true;
        this.fetchVPNInfo = new RectF();
        this.AuCTel = new MPPointF();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setLayoutDirection(3);
    }

    @Override // o.uBX
    public android.view.View OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(uBT.Activity.EZpvd, viewGroup, true);
        this.getNewProxyInstance = (android.widget.TextView) viewInflate.findViewById(uBT.TaskDescription.isConnected);
        this.fIwbmz = (Group) viewInflate.findViewById(uBT.TaskDescription.copydefault);
        this.hDKMBd = (Group) viewInflate.findViewById(uBT.TaskDescription.OLrzqt);
        this.ejfBZ = new java.util.ArrayList<>();
        this.uzCIH = new java.util.ArrayList<>();
        this.iwGUEr = new java.util.ArrayList<>();
        this.getFieldNames = new java.util.ArrayList<>();
        java.util.ArrayList arrayList = this.ejfBZ;
        android.widget.TextView textView = null;
        if (arrayList == null) {
            Intrinsics.gEmmrt("");
            arrayList = null;
        }
        arrayList.add(viewInflate.findViewById(uBT.TaskDescription.fetchVPNInfo));
        java.util.ArrayList arrayList2 = this.ejfBZ;
        if (arrayList2 == null) {
            Intrinsics.gEmmrt("");
            arrayList2 = null;
        }
        arrayList2.add(viewInflate.findViewById(uBT.TaskDescription.AkhnZx));
        java.util.ArrayList arrayList3 = this.ejfBZ;
        if (arrayList3 == null) {
            Intrinsics.gEmmrt("");
            arrayList3 = null;
        }
        arrayList3.add(viewInflate.findViewById(uBT.TaskDescription.DbNXlk));
        java.util.ArrayList arrayList4 = this.ejfBZ;
        if (arrayList4 == null) {
            Intrinsics.gEmmrt("");
            arrayList4 = null;
        }
        arrayList4.add(viewInflate.findViewById(uBT.TaskDescription.AuCTel));
        java.util.ArrayList arrayList5 = this.uzCIH;
        if (arrayList5 == null) {
            Intrinsics.gEmmrt("");
            arrayList5 = null;
        }
        arrayList5.add(viewInflate.findViewById(uBT.TaskDescription.fIwbmz));
        java.util.ArrayList arrayList6 = this.uzCIH;
        if (arrayList6 == null) {
            Intrinsics.gEmmrt("");
            arrayList6 = null;
        }
        arrayList6.add(viewInflate.findViewById(uBT.TaskDescription.fJNWhG));
        java.util.ArrayList arrayList7 = this.uzCIH;
        if (arrayList7 == null) {
            Intrinsics.gEmmrt("");
            arrayList7 = null;
        }
        arrayList7.add(viewInflate.findViewById(uBT.TaskDescription.hDKMBd));
        java.util.ArrayList arrayList8 = this.uzCIH;
        if (arrayList8 == null) {
            Intrinsics.gEmmrt("");
            arrayList8 = null;
        }
        arrayList8.add(viewInflate.findViewById(uBT.TaskDescription.iwGUEr));
        java.util.ArrayList arrayList9 = this.iwGUEr;
        if (arrayList9 == null) {
            Intrinsics.gEmmrt("");
            arrayList9 = null;
        }
        arrayList9.add(viewInflate.findViewById(uBT.TaskDescription.AEQbTJ));
        java.util.ArrayList arrayList10 = this.iwGUEr;
        if (arrayList10 == null) {
            Intrinsics.gEmmrt("");
            arrayList10 = null;
        }
        arrayList10.add(viewInflate.findViewById(uBT.TaskDescription.EZpvd));
        java.util.ArrayList arrayList11 = this.iwGUEr;
        if (arrayList11 == null) {
            Intrinsics.gEmmrt("");
            arrayList11 = null;
        }
        arrayList11.add(viewInflate.findViewById(uBT.TaskDescription.AhwBna));
        java.util.ArrayList arrayList12 = this.iwGUEr;
        if (arrayList12 == null) {
            Intrinsics.gEmmrt("");
            arrayList12 = null;
        }
        arrayList12.add(viewInflate.findViewById(uBT.TaskDescription.gEmmrt));
        java.util.ArrayList arrayList13 = this.getFieldNames;
        if (arrayList13 == null) {
            Intrinsics.gEmmrt("");
            arrayList13 = null;
        }
        arrayList13.add(viewInflate.findViewById(uBT.TaskDescription.AYXKKw));
        java.util.ArrayList arrayList14 = this.getFieldNames;
        if (arrayList14 == null) {
            Intrinsics.gEmmrt("");
            arrayList14 = null;
        }
        arrayList14.add(viewInflate.findViewById(uBT.TaskDescription.djBIcL));
        java.util.ArrayList arrayList15 = this.getFieldNames;
        if (arrayList15 == null) {
            Intrinsics.gEmmrt("");
            arrayList15 = null;
        }
        arrayList15.add(viewInflate.findViewById(uBT.TaskDescription.valueOf));
        java.util.ArrayList arrayList16 = this.getFieldNames;
        if (arrayList16 == null) {
            Intrinsics.gEmmrt("");
            arrayList16 = null;
        }
        arrayList16.add(viewInflate.findViewById(uBT.TaskDescription.values));
        android.graphics.Paint paint = new android.graphics.Paint();
        android.widget.TextView textView2 = this.getNewProxyInstance;
        if (textView2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView = textView2;
        }
        paint.setTextSize(textView.getTextSize());
        this.fARcdN = paint;
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return viewInflate;
    }

    public final boolean EZpvd(float f, float f2) {
        this.fetchVPNInfo.set(copydefault().x - (getWidth() / 2.0f), copydefault().y, copydefault().x + (getWidth() / 2.0f), copydefault().y + getHeight());
        return this.fetchVPNInfo.contains(f, f2);
    }

    public final void AhwBna() {
        copydefault().x = 0.0f;
        copydefault().y = 0.0f;
    }

    public final void setTitleText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(str);
        android.widget.TextView textView = this.getNewProxyInstance;
        android.widget.TextView textView2 = null;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(str);
        android.widget.TextView textView3 = this.getNewProxyInstance;
        if (textView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView2 = textView3;
        }
        textView2.setVisibility(0);
    }

    private final void KWHzl(java.lang.String str) {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Paint paint = this.fARcdN;
        Group group = null;
        if (paint == null) {
            Intrinsics.gEmmrt("");
            paint = null;
        }
        paint.getTextBounds(str, 0, str.length(), rect);
        this.fJNWhG = rect.width() <= C55298xhM.dp2px$default(156.0f, null, 1, null);
        Group group2 = this.fIwbmz;
        if (group2 == null) {
            Intrinsics.gEmmrt("");
            group2 = null;
        }
        group2.setVisibility(this.fJNWhG ? 0 : 8);
        Group group3 = this.hDKMBd;
        if (group3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            group = group3;
        }
        group.setVisibility(this.fJNWhG ? 8 : 0);
    }

    public static /* synthetic */ Triple genContent$default(uBY uby, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: genContent");
        }
        if ((i2 & 4) != 0) {
            i = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        return uby.AEQbTJ(str, str2, i);
    }

    public final Triple<java.lang.String, java.lang.String, java.lang.Integer> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Triple<>(str, str2, java.lang.Integer.valueOf(i));
    }

    public final int EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((java.lang.Object) str);
        if (C33129mqd.AEQbTJ(bigDecimalOLrzqt, 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        }
        if (!C33129mqd.gEmmrt(bigDecimalOLrzqt, 0)) {
            return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        this.AuCTel.x = OLrzqt(f);
        this.AuCTel.y = EZpvd(f2);
        return this.AuCTel;
    }

    private final float OLrzqt(float f) {
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

    public float EZpvd(float f) {
        Chart chartView = getChartView();
        boolean z = chartView != null && f < ((float) chartView.getHeight()) - f;
        gEmmrt().setVisibility(z ? 4 : 0);
        djBIcL().setVisibility(z ? 0 : 8);
        if (z) {
            return KWHzl();
        }
        return -(getHeight() + KWHzl());
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
        KWHzl(first + (second != null ? second : ""));
        java.util.ArrayList arrayList = new java.util.ArrayList(tripleArr.length);
        int length5 = tripleArr.length;
        for (int i3 = 0; i3 < length5; i3++) {
            arrayList.add(tripleArr[i3].getFirst());
        }
        AEQbTJ(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(tripleArr.length);
        for (Triple<java.lang.String, java.lang.String, java.lang.Integer> triple5 : tripleArr) {
            arrayList2.add(triple5.getSecond());
        }
        KWHzl(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(tripleArr.length);
        for (Triple<java.lang.String, java.lang.String, java.lang.Integer> triple6 : tripleArr) {
            arrayList3.add(java.lang.Integer.valueOf(triple6.getThird().intValue()));
        }
        OLrzqt(arrayList3);
    }

    private final void AEQbTJ(java.util.List<java.lang.String> list) {
        java.util.ArrayList<android.widget.TextView> arrayList;
        java.util.Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            java.util.ArrayList<android.widget.TextView> arrayList2 = null;
            if (!it.hasNext()) {
                if (!this.fJNWhG ? (arrayList = this.iwGUEr) != null : (arrayList = this.ejfBZ) != null) {
                    arrayList2 = arrayList;
                } else {
                    Intrinsics.gEmmrt("");
                }
                int i2 = 0;
                for (java.lang.Object obj : arrayList2) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    ((android.widget.TextView) obj).setVisibility(i2 < list.size() ? 0 : 8);
                    i2++;
                }
                return;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) next;
            if (this.fJNWhG) {
                java.util.ArrayList<android.widget.TextView> arrayList3 = this.ejfBZ;
                if (arrayList3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList2 = arrayList3;
                }
                android.widget.TextView textView = (android.widget.TextView) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, i);
                if (textView == null) {
                    return;
                } else {
                    textView.setText(str);
                }
            } else {
                java.util.ArrayList<android.widget.TextView> arrayList4 = this.iwGUEr;
                if (arrayList4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList2 = arrayList4;
                }
                android.widget.TextView textView2 = (android.widget.TextView) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, i);
                if (textView2 == null) {
                    return;
                } else {
                    textView2.setText(str);
                }
            }
            i++;
        }
    }

    private final void KWHzl(java.util.List<java.lang.String> list) {
        java.util.ArrayList<android.widget.TextView> arrayList;
        java.util.Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            java.util.ArrayList<android.widget.TextView> arrayList2 = null;
            if (!it.hasNext()) {
                if (!this.fJNWhG ? (arrayList = this.getFieldNames) != null : (arrayList = this.uzCIH) != null) {
                    arrayList2 = arrayList;
                } else {
                    Intrinsics.gEmmrt("");
                }
                int i2 = 0;
                for (java.lang.Object obj : arrayList2) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    ((android.widget.TextView) obj).setVisibility(i2 < list.size() ? 0 : 8);
                    i2++;
                }
                return;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) next;
            if (this.fJNWhG) {
                java.util.ArrayList<android.widget.TextView> arrayList3 = this.uzCIH;
                if (arrayList3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList2 = arrayList3;
                }
                android.widget.TextView textView = (android.widget.TextView) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, i);
                if (textView == null) {
                    return;
                } else {
                    textView.setText(str);
                }
            } else {
                java.util.ArrayList<android.widget.TextView> arrayList4 = this.getFieldNames;
                if (arrayList4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList2 = arrayList4;
                }
                android.widget.TextView textView2 = (android.widget.TextView) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, i);
                if (textView2 == null) {
                    return;
                } else {
                    textView2.setText(str);
                }
            }
            i++;
        }
    }

    private final void OLrzqt(java.util.List<java.lang.Integer> list) {
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            int iIntValue = ((java.lang.Number) obj).intValue();
            java.util.ArrayList<android.widget.TextView> arrayList = null;
            if (this.fJNWhG) {
                java.util.ArrayList<android.widget.TextView> arrayList2 = this.uzCIH;
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
                java.util.ArrayList<android.widget.TextView> arrayList3 = this.getFieldNames;
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
