package kr.project.shortlink.api.application;

import kr.project.shortlink.api.repository.ShortLinkRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ShortLinkServiceTest {

    @InjectMocks
    private ShortLinkService shortLinkService;

    @Mock
    private ShortLinkRepository shortLinkRepository;

    @DisplayName("단축링크 생성")
    @Test
    void create() {

    }

    @DisplayName("단축링크 조회")
    @Test
    void findById() {

    }
}