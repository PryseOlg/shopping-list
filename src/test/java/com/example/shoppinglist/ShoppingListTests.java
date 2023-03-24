package com.example.shoppinglist;

import net.luckyvalenok.shoppinglist.controller.RESTController;
import net.luckyvalenok.shoppinglist.model.Product;
import net.luckyvalenok.shoppinglist.repository.ProductRepository;
import net.luckyvalenok.shoppinglist.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import java.nio.charset.StandardCharsets;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class ShoppingListTests {

    private RESTController restController;


    private ProductRepository productRepository;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void restTest() throws Exception{
        assertThat(restController).isNotNull();
    }

    @Test
    public void listTest() throws Exception {
        this.mockMvc.perform(get("/api/"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void addTest() throws Exception {
        this.mockMvc.perform(post("/add").param("tomato", "tomato"))
                .andDo(print())
                .andExpect(status().isOk());
    }

}
