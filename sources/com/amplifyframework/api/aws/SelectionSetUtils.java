package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.graphql.QueryType;
import com.amplifyframework.core.model.PropertyContainerPath;
import com.amplifyframework.core.model.PropertyPath;
import com.amplifyframework.core.model.PropertyPathMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SelectionSetUtils {
    public static final SelectionSet findChildByName(@NotNull SelectionSet selectionSet, @NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(selectionSet, "");
        Intrinsics.checkNotNullParameter(str, "");
        Set<SelectionSet> nodes = selectionSet.getNodes();
        Intrinsics.checkNotNullExpressionValue(nodes, "");
        Iterator<T> it = nodes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((SelectionSet) next).getValue(), (Object) str)) {
                break;
            }
        }
        return (SelectionSet) next;
    }

    public static final void replaceChild(@NotNull SelectionSet selectionSet, @NotNull final SelectionSet selectionSet2) {
        Intrinsics.checkNotNullParameter(selectionSet, "");
        Intrinsics.checkNotNullParameter(selectionSet2, "");
        Set<SelectionSet> nodes = selectionSet.getNodes();
        final Function1<SelectionSet, Boolean> function1 = new Function1<SelectionSet, Boolean>() { // from class: com.amplifyframework.api.aws.SelectionSetUtils.replaceChild.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SelectionSet selectionSet3) {
                return Boolean.valueOf(Intrinsics.EZpvd((Object) selectionSet3.getValue(), (Object) selectionSet2.getValue()));
            }
        };
        nodes.removeIf(new Predicate() { // from class: com.amplifyframework.api.aws.SelectionSetUtils$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SelectionSetUtils.replaceChild$lambda$1(function1, obj);
            }
        });
        selectionSet.getNodes().add(selectionSet2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean replaceChild$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final SelectionSet asSelectionSetWithoutRoot(@NotNull PropertyContainerPath propertyContainerPath) {
        Object next;
        Intrinsics.checkNotNullParameter(propertyContainerPath, "");
        ArrayList arrayList = new ArrayList();
        List<PropertyContainerPath> listNodesInPath = nodesInPath(propertyContainerPath, false);
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listNodesInPath, 10));
        for (PropertyContainerPath propertyContainerPath2 : listNodesInPath) {
            arrayList.add(Boolean.valueOf(propertyContainerPath2.getMetadata().isCollection()));
            arrayList2.add(getSelectionSet(propertyContainerPath2));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next2 = it.next();
        int i = 1;
        while (it.hasNext()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            SelectionSet selectionSet = (SelectionSet) it.next();
            SelectionSet selectionSet2 = (SelectionSet) next2;
            if (((Boolean) arrayList.get(i)).booleanValue()) {
                Set<SelectionSet> nodes = selectionSet.getNodes();
                Intrinsics.checkNotNullExpressionValue(nodes, "");
                Iterator<T> it2 = nodes.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.EZpvd((Object) ((SelectionSet) next).getValue(), (Object) "items")) {
                        break;
                    }
                }
                SelectionSet selectionSet3 = (SelectionSet) next;
                if (selectionSet3 != null) {
                    replaceChild(selectionSet3, selectionSet2);
                }
            } else {
                replaceChild(selectionSet, selectionSet2);
            }
            i++;
            next2 = selectionSet;
        }
        return (SelectionSet) next2;
    }

    private static final SelectionSet getSelectionSet(PropertyContainerPath propertyContainerPath) throws AmplifyException {
        PropertyPathMetadata metadata = propertyContainerPath.getMetadata();
        SelectionSet selectionSetBuild = SelectionSet.builder().operation(QueryType.GET).value(metadata.isCollection() ? "items" : metadata.getName()).requestOptions(new ApiGraphQLRequestOptions(0)).modelClass(propertyContainerPath.getModelType()).build();
        if (metadata.isCollection()) {
            selectionSetBuild = new SelectionSet(metadata.getName(), yEE.gEmmrt(selectionSetBuild));
        }
        Intrinsics.copydefault(selectionSetBuild);
        return selectionSetBuild;
    }

    private static final boolean shouldProcessNode(PropertyContainerPath propertyContainerPath, boolean z) {
        return z || propertyContainerPath.getMetadata().getParent() != null;
    }

    private static final List<PropertyContainerPath> nodesInPath(PropertyContainerPath propertyContainerPath, boolean z) {
        ArrayList arrayList = new ArrayList();
        while (propertyContainerPath != null && shouldProcessNode(propertyContainerPath, z)) {
            arrayList.add(propertyContainerPath);
            PropertyPath parent = propertyContainerPath.getMetadata().getParent();
            propertyContainerPath = parent instanceof PropertyContainerPath ? (PropertyContainerPath) parent : null;
        }
        return arrayList;
    }

    public static final void mergeChild(@NotNull SelectionSet selectionSet, @NotNull SelectionSet selectionSet2) {
        Intrinsics.checkNotNullParameter(selectionSet, "");
        Intrinsics.checkNotNullParameter(selectionSet2, "");
        String value = selectionSet2.getValue();
        if (value == null) {
            value = "";
        }
        SelectionSet selectionSetFindChildByName = findChildByName(selectionSet, value);
        if (selectionSetFindChildByName != null) {
            ArrayList arrayList = new ArrayList();
            Set<SelectionSet> nodes = selectionSet2.getNodes();
            Intrinsics.checkNotNullExpressionValue(nodes, "");
            for (SelectionSet selectionSet3 : nodes) {
                String value2 = selectionSet3.getValue();
                Intrinsics.checkNotNullExpressionValue(selectionSet3.getNodes(), "");
                if ((!r4.isEmpty()) && value2 != null) {
                    if (findChildByName(selectionSetFindChildByName, value2) != null) {
                        Intrinsics.copydefault(selectionSet3);
                        mergeChild(selectionSetFindChildByName, selectionSet3);
                    } else {
                        Intrinsics.copydefault(selectionSet3);
                        arrayList.add(selectionSet3);
                    }
                } else {
                    Intrinsics.copydefault(selectionSet3);
                    arrayList.add(selectionSet3);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                replaceChild(selectionSetFindChildByName, (SelectionSet) it.next());
            }
            return;
        }
        selectionSet.getNodes().add(selectionSet2);
    }
}
