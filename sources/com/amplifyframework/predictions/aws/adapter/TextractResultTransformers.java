package com.amplifyframework.predictions.aws.adapter;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.models.BoundedKeyValue;
import com.amplifyframework.predictions.models.Cell;
import com.amplifyframework.predictions.models.IdentifiedText;
import com.amplifyframework.predictions.models.Polygon;
import com.amplifyframework.predictions.models.Selection;
import com.amplifyframework.predictions.models.Table;
import com.amplifyframework.util.Empty;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractC33630nA;
import o.AbstractC34788nj;
import o.AbstractC35715oB;
import o.C34735ni;
import o.C35000nn;
import o.C35823oF;
import o.C37556ow;

/* JADX INFO: loaded from: classes14.dex */
public final class TextractResultTransformers {
    private TextractResultTransformers() {
    }

    public static RectF fromBoundingBox(@Nullable C35000nn c35000nn) {
        if (c35000nn == null) {
            return null;
        }
        return new RectF(c35000nn.AEQbTJ(), c35000nn.copydefault(), c35000nn.AEQbTJ() + c35000nn.OLrzqt(), c35000nn.copydefault() + c35000nn.EZpvd());
    }

    public static Polygon fromPoints(@Nullable List<C37556ow> list) {
        if (Empty.check(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C37556ow c37556ow : list) {
            arrayList.add(new PointF(c37556ow.OLrzqt(), c37556ow.EZpvd()));
        }
        return Polygon.fromPoints(arrayList);
    }

    public static IdentifiedText fetchIdentifiedText(@Nullable C34735ni c34735ni) {
        if (c34735ni == null || c34735ni.fetchVPNInfo() == null || c34735ni.EZpvd() == null) {
            return null;
        }
        return ((IdentifiedText.Builder) ((IdentifiedText.Builder) ((IdentifiedText.Builder) IdentifiedText.builder().text(c34735ni.fetchVPNInfo()).confidence(c34735ni.EZpvd().floatValue())).box(c34735ni.djBIcL() != null ? fromBoundingBox(c34735ni.djBIcL().EZpvd()) : null)).polygon(fromPoints(c34735ni.djBIcL() != null ? c34735ni.djBIcL().AEQbTJ() : null))).page(c34735ni.gEmmrt() != null ? c34735ni.gEmmrt().intValue() : 0).build();
    }

    public static Selection fetchSelection(@Nullable C34735ni c34735ni) {
        if (c34735ni == null || c34735ni.DbNXlk() == null) {
            return null;
        }
        return Selection.builder().box(c34735ni.djBIcL() != null ? fromBoundingBox(c34735ni.djBIcL().EZpvd()) : null).polygon(fromPoints(c34735ni.djBIcL() != null ? c34735ni.djBIcL().AEQbTJ() : null)).selected(AbstractC35715oB.ActionBar.copydefault.equals(c34735ni.DbNXlk())).build();
    }

    public static Table fetchTable(@Nullable C34735ni c34735ni, @NonNull final Map<String, C34735ni> map) {
        Objects.requireNonNull(map);
        if (c34735ni == null || !AbstractC34788nj.Intent.KWHzl.equals(c34735ni.KWHzl()) || c34735ni.EZpvd() == null) {
            return null;
        }
        final ArrayList arrayList = new ArrayList();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        doForEachRelatedBlock(c34735ni, map, new Consumer() { // from class: com.amplifyframework.predictions.aws.adapter.TextractResultTransformers$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                TextractResultTransformers.lambda$fetchTable$0(hashSet, hashSet2, arrayList, map, (C34735ni) obj);
            }
        });
        return ((Table.Builder) ((Table.Builder) ((Table.Builder) Table.builder().cells(arrayList).confidence(c34735ni.EZpvd().floatValue())).box(c34735ni.djBIcL() != null ? fromBoundingBox(c34735ni.djBIcL().EZpvd()) : null)).polygon(fromPoints(c34735ni.djBIcL() != null ? c34735ni.djBIcL().AEQbTJ() : null))).rowSize(hashSet.size()).columnSize(hashSet2.size()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchTable$0(Set set, Set set2, List list, Map map, C34735ni c34735ni) {
        if (c34735ni.isConnected() == null || c34735ni.OLrzqt() == null) {
            return;
        }
        set.add(Integer.valueOf(c34735ni.isConnected().intValue() - 1));
        set2.add(Integer.valueOf(c34735ni.OLrzqt().intValue() - 1));
        list.add(fetchTableCell(c34735ni, map));
    }

    public static BoundedKeyValue fetchKeyValue(@Nullable C34735ni c34735ni, @NonNull final Map<String, C34735ni> map) {
        List<AbstractC33630nA> listAEQbTJ;
        Objects.requireNonNull(map);
        if (c34735ni == null || !AbstractC34788nj.StateListAnimator.KWHzl.equals(c34735ni.KWHzl()) || c34735ni.EZpvd() == null || (listAEQbTJ = c34735ni.AEQbTJ()) == null || !listAEQbTJ.contains(AbstractC33630nA.TaskDescription.AEQbTJ)) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        doForEachRelatedBlock(c34735ni, map, new Consumer() { // from class: com.amplifyframework.predictions.aws.adapter.TextractResultTransformers$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                TextractResultTransformers.lambda$fetchKeyValue$2(sb, map, sb2, (C34735ni) obj);
            }
        });
        return ((BoundedKeyValue.Builder) ((BoundedKeyValue.Builder) ((BoundedKeyValue.Builder) BoundedKeyValue.builder().keyValuePair(sb.toString().trim(), sb2.toString().trim()).confidence(c34735ni.EZpvd().floatValue())).box(c34735ni.djBIcL() != null ? fromBoundingBox(c34735ni.djBIcL().EZpvd()) : null)).polygon(fromPoints(c34735ni.djBIcL() != null ? c34735ni.djBIcL().AEQbTJ() : null))).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchKeyValue$2(StringBuilder sb, Map map, final StringBuilder sb2, C34735ni c34735ni) {
        if (c34735ni.fetchVPNInfo() != null) {
            sb.append(c34735ni.fetchVPNInfo());
            sb.append(" ");
        }
        doForEachRelatedBlock(c34735ni, map, new Consumer() { // from class: com.amplifyframework.predictions.aws.adapter.TextractResultTransformers$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                TextractResultTransformers.lambda$fetchKeyValue$1(sb2, (C34735ni) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchKeyValue$1(StringBuilder sb, C34735ni c34735ni) {
        sb.append(c34735ni.fetchVPNInfo());
        sb.append(" ");
    }

    private static Cell fetchTableCell(@Nullable C34735ni c34735ni, @NonNull Map<String, C34735ni> map) {
        Objects.requireNonNull(map);
        if (c34735ni != null && AbstractC34788nj.Activity.copydefault.equals(c34735ni.KWHzl()) && c34735ni.EZpvd() != null) {
            final StringBuilder sb = new StringBuilder();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            doForEachRelatedBlock(c34735ni, map, new Consumer() { // from class: com.amplifyframework.predictions.aws.adapter.TextractResultTransformers$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    TextractResultTransformers.lambda$fetchTableCell$3(sb, atomicBoolean, (C34735ni) obj);
                }
            });
            List<C37556ow> listAEQbTJ = c34735ni.djBIcL() != null ? c34735ni.djBIcL().AEQbTJ() : null;
            if (c34735ni.isConnected() != null && c34735ni.OLrzqt() != null) {
                return ((Cell.Builder) ((Cell.Builder) ((Cell.Builder) Cell.builder().text(sb.toString().trim()).confidence(c34735ni.EZpvd().floatValue())).box(c34735ni.djBIcL() != null ? fromBoundingBox(c34735ni.djBIcL().EZpvd()) : null)).polygon(fromPoints(listAEQbTJ))).selected(atomicBoolean.get()).row(c34735ni.isConnected().intValue() - 1).column(c34735ni.OLrzqt().intValue() - 1).build();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchTableCell$3(StringBuilder sb, AtomicBoolean atomicBoolean, C34735ni c34735ni) {
        String strFetchVPNInfo = c34735ni.fetchVPNInfo();
        if (strFetchVPNInfo != null) {
            sb.append(strFetchVPNInfo);
            sb.append(" ");
        }
        AbstractC35715oB abstractC35715oBDbNXlk = c34735ni.DbNXlk();
        if (abstractC35715oBDbNXlk != null) {
            atomicBoolean.set(AbstractC35715oB.ActionBar.copydefault.equals(abstractC35715oBDbNXlk));
        }
    }

    private static void doForEachRelatedBlock(C34735ni c34735ni, Map<String, C34735ni> map, Consumer<C34735ni> consumer) {
        if (c34735ni == null || c34735ni.AYXKKw() == null) {
            return;
        }
        Iterator<C35823oF> it = c34735ni.AYXKKw().iterator();
        while (it.hasNext()) {
            List<String> listAEQbTJ = it.next().AEQbTJ();
            if (listAEQbTJ != null) {
                Iterator<String> it2 = listAEQbTJ.iterator();
                while (it2.hasNext()) {
                    C34735ni c34735ni2 = map.get(it2.next());
                    if (c34735ni2 != null) {
                        consumer.accept(c34735ni2);
                    }
                }
            }
        }
    }
}
