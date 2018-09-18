package reflex.behavior;

import java.util.*;

public interface AnnotationBehaviorProcessor {
    Optional<Object> process(Class objClass, Object obj, List<Object> parameters);
}