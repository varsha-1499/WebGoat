package org.owasp.webgoat.lessons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.owasp.webgoat.session.WebSession;

/**
 * <p>LessonInfoModel class.</p>
 *
 * @author dm
 * @version $Id: $Id
 */
@Getter
@AllArgsConstructor
public class LessonInfoModel {

    private String lessonTitle;
    private boolean hasSource;
    private boolean hasSolution;
    private boolean hasPlan;

}